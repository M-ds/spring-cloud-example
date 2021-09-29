package nl.mds.springcloud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lastname;
    private long company_id;

    public Employee(long id, String firstname, String lastname, long company_id) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.company_id = company_id;
    }

    public Employee() {
        this(0, "", "", 0);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(long companyId) {
        this.company_id = companyId;
    }
}
