package nl.mds.springcloud.controller.response;

import nl.mds.springcloud.controller.domain.CourseDto;

import java.util.List;

public class JsonListResponse {

    private final List<CourseDto> courses;
    private final String errorMessage;

    public JsonListResponse(List<CourseDto> courses, String errorMessage) {
        this.courses = courses;
        this.errorMessage = errorMessage;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
