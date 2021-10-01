package nl.mds.springcloud.controller.domain;

import nl.mds.springcloud.domain.SchoolType;

import java.util.UUID;

public class CourseDto {

    private final UUID id;
    private final String name;
    private final SchoolType schoolType;

    public CourseDto(UUID id, String name, SchoolType schoolType) {
        this.id = id;
        this.name = name;
        this.schoolType = schoolType;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SchoolType getSchoolType() {
        return schoolType;
    }
}
