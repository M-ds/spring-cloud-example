package nl.mds.springcloud.repository.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "email")
    private String email;
    @OneToMany(
            fetch = FetchType.LAZY,
            targetEntity = StudentCourse.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "student"
    )
    @JsonIgnore
    private List<StudentCourse> studentCourses;

    public Student(int id, String firstname, String lastname, String email, List<StudentCourse> studentCourses) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.studentCourses = studentCourses;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setCourseIds(List<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }
}
