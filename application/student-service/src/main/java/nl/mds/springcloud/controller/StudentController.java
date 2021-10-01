package nl.mds.springcloud.controller;

import nl.mds.springcloud.controller.response.StudentResponse;
import nl.mds.springcloud.service.StudentService;
import nl.mds.springcloud.service.domain.StudentWithCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(@Autowired StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/find/{studentId}")
    public StudentResponse findStudent(@PathVariable int studentId) {
        StudentWithCourses studentWithCourses = studentService.find(studentId);
        return StudentResponse.from(studentWithCourses);
    }

    private void from(StudentWithCourses studentWithCourses) {
    }
}
