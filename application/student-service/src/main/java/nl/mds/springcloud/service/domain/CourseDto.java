package nl.mds.springcloud.service.domain;

import java.util.UUID;

public class CourseDto {

    private UUID id;
    private String name;
    private String schoolType;

    public CourseDto(UUID id, String name, String schoolType) {
        this.id = id;
        this.name = name;
        this.schoolType = schoolType;
    }

    public CourseDto() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }
}
