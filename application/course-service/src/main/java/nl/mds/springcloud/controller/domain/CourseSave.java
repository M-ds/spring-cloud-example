package nl.mds.springcloud.controller.domain;

public class CourseSave {

    private final String name;
    private final String schoolType;

    private CourseSave(String name, String schoolType) {
        this.name = name;
        this.schoolType = schoolType;
    }

    public String getName() {
        return name;
    }

    public String getSchoolType() {
        return schoolType;
    }
}
