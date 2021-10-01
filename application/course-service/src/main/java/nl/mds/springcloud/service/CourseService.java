package nl.mds.springcloud.service;

import nl.mds.springcloud.controller.domain.CourseDto;
import nl.mds.springcloud.controller.domain.CourseSave;
import nl.mds.springcloud.exception.CourseNameEmptyException;
import nl.mds.springcloud.repository.CourseRepository;
import nl.mds.springcloud.repository.domain.Course;
import nl.mds.springcloud.service.convert.Converter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CourseService {

    private static final Logger logger = LoggerFactory.getLogger(CourseService.class);
    private final CourseRepository courseRepository;

    public CourseService(@Autowired CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public CourseDto find(String uuid) {
        var convertedUuid = UUID.fromString(uuid);

        var foundOptional = courseRepository.findById(convertedUuid);
        return foundOptional.map(Converter::convertToDto).orElse(null);
    }

    public boolean save(CourseSave courseSave) {
        Course convertedCourseVo;
        try {
            convertedCourseVo = Converter.convertToCourse(courseSave);
        } catch (CourseNameEmptyException e) {
            logger.error("Could not parse course. Course name is empty or null! Stacktrace: {}", e.getMessage());
            return false;
        }

        courseRepository.save(convertedCourseVo);
        return true; // saved entity will just be returned by default. Therefore, no need to check if this is not null.
    }
}
