package nl.mds.springcloud.service.domain;

import java.util.List;

public class CourseRestResponse {

    private List<CourseDto> courses;
    private String errorMessage;

    public CourseRestResponse(List<CourseDto> courses, String errorMessage) {
        this.courses = courses;
        this.errorMessage = errorMessage;
    }

    public CourseRestResponse() {
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDto> cours) {
        this.courses = cours;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
