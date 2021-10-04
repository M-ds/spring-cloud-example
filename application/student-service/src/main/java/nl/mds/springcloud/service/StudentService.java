package nl.mds.springcloud.service;

import nl.mds.springcloud.config.RestTemplateConfig;
import nl.mds.springcloud.repository.StudentRepository;
import nl.mds.springcloud.repository.domain.StudentCourse;
import nl.mds.springcloud.service.domain.CourseRestResponse;
import nl.mds.springcloud.service.domain.StudentWithCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final RestTemplate restTemplate;

    public StudentService(@Autowired StudentRepository studentRepository, @Autowired RestTemplateConfig restTemplateConfig) {
        this.studentRepository = studentRepository;
        this.restTemplate = restTemplateConfig.restTemplate();
    }

    public StudentWithCourses find(int studentId) {
        var foundStudent = studentRepository.findById(studentId).orElseThrow();

        Map<String, List<String>> uriVariables = createVariableMap(foundStudent.getStudentCourses());
        CourseRestResponse courses = restTemplate.getForObject(
                "http://course-service/find/all-student-courses?ids={courseIds}",
                CourseRestResponse.class,
                uriVariables
        );

        if (courses == null) {
            return new StudentWithCourses.Builder().build();
        }

        return new StudentWithCourses.Builder()
                .setStudent(foundStudent)
                .setRegisteredCourses(courses.getCourses())
                .build();
    }

    private Map<String, List<String>> createVariableMap(List<StudentCourse> studentCourses) {
        Map<String, List<String>> paramMap = new HashMap<>();
        List<String> courseIds = new ArrayList<>();

        studentCourses.forEach(studentCourse -> courseIds.add(studentCourse.getCourseId().toString()));
        paramMap.put("courseIds", courseIds);

        return paramMap;
    }
}
