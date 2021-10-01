package nl.mds.springcloud.repository.domain;

import nl.mds.springcloud.domain.SchoolType;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "id")
    @Type(type = "uuid-char")
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "school_type")
    @Enumerated(EnumType.STRING)
    private SchoolType schoolType;

    public Course(UUID id, String name, SchoolType schoolType) {
        this.id = id;
        this.name = name;
        this.schoolType = schoolType;
    }

    public Course() {
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

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }
}
