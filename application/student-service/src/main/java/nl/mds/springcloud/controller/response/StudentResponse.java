package nl.mds.springcloud.controller.response;

import nl.mds.springcloud.service.domain.StudentWithCourses;

public class StudentResponse {

    private final StudentWithCourses studentWithCourses;
    private final String extraMessage;

    private StudentResponse(StudentWithCourses studentWithCourses, String extraMessage) {
        this.studentWithCourses = studentWithCourses;
        this.extraMessage = extraMessage;
    }

    public static StudentResponse from(StudentWithCourses studentWithCourses) {
        if (studentWithCourses.getCourses().isEmpty()) {
            return new StudentResponse(studentWithCourses, "This student has not been registered to any courses!");
        } else {
            return new StudentResponse(studentWithCourses, "");
        }
    }

    public StudentWithCourses getStudentWithCourses() {
        return studentWithCourses;
    }

    public String getExtraMessage() {
        return extraMessage;
    }
}
