package nl.mds.springcloud.service.convert;

import nl.mds.springcloud.controller.domain.CourseDto;
import nl.mds.springcloud.controller.domain.CourseSave;
import nl.mds.springcloud.domain.SchoolType;
import nl.mds.springcloud.exception.CourseNameEmptyException;
import nl.mds.springcloud.repository.domain.Course;

import java.util.UUID;

public class Converter {

    public static Course convertToCourse(CourseSave courseSave) throws CourseNameEmptyException {
        String schoolType = courseSave.getSchoolType();
        String name = courseSave.getName();
        if (name == null || name.isBlank()) {
            throw new CourseNameEmptyException("Course name can not be empty or null. Please check the value passed!");
        }

        var parsedSchoolType = SchoolType.valueOf(schoolType);

        return new Course(UUID.randomUUID(), name, parsedSchoolType);
    }

    public static CourseDto convertToDto(Course course) {
        return new CourseDto(
                course.getId(),
                course.getName(),
                course.getSchoolType()
        );
    }
}
