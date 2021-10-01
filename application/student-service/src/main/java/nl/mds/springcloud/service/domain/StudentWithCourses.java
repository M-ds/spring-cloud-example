package nl.mds.springcloud.service.domain;

import nl.mds.springcloud.repository.domain.Student;

import java.util.List;

public class StudentWithCourses {

    private final Student student;
    private final List<CourseDto> courses;

    private StudentWithCourses(Student student, List<CourseDto> courses) {
        this.student = student;
        this.courses = courses;
    }

    public Student getStudent() {
        return student;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public static class Builder {
        private Student student;
        private List<CourseDto> courses;

        public Builder setStudent(Student student) {
            this.student = student;
            return this;
        }

        public Builder setRegisteredCourses(List<CourseDto> courses) {
            this.courses = courses;
            return this;
        }

        public StudentWithCourses build() {
            return new StudentWithCourses(student, courses);
        }
    }
}
