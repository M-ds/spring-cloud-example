package nl.mds.springcloud.controller.response;

import nl.mds.springcloud.controller.domain.CourseDto;

public class JsonResponse {

    private final CourseDto courseDto;
    private final String errorMessage;

    public JsonResponse(CourseDto courseDto, String errorMessage) {
        this.courseDto = courseDto;
        this.errorMessage = errorMessage;
    }

    public CourseDto getCourseDto() {
        return courseDto;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
