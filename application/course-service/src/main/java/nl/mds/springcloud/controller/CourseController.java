package nl.mds.springcloud.controller;

import nl.mds.springcloud.controller.domain.CourseDto;
import nl.mds.springcloud.controller.domain.CourseSave;
import nl.mds.springcloud.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private final CourseService courseService;

    public CourseController(@Autowired CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/find/{uuid}")
    public JsonResponse find(@PathVariable String uuid) {
        CourseDto courseDto = courseService.find(uuid);
        if (courseDto == null)
            return new JsonResponse(null, "Could not find the correct Course for the given id. [id = " + uuid + "]");
        else return new JsonResponse(courseDto, "");
    }

    @PostMapping("/save")
    public boolean save(@RequestBody CourseSave courseSave) {
        return courseService.save(courseSave);
    }

}
