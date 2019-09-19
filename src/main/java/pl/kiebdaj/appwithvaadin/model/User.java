package pl.kiebdaj.appwithvaadin.model;

import java.sql.Date;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String numberOfID;
    private Date startDateOfRent;
    private Date endDateOfRent;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberOfID() {
        return numberOfID;
    }

    public void setNumberOfID(String numberOfID) {
        this.numberOfID = numberOfID;
    }

    public Date getStartDateOfRent() {
        return startDateOfRent;
    }

    public void setStartDateOfRent(Date startDateOfRent) {
        this.startDateOfRent = startDateOfRent;
    }

    public Date getEndDateOfRent() {
        return endDateOfRent;
    }

    public void setEndDateOfRent(Date endDateOfRent) {
        this.endDateOfRent = endDateOfRent;
    }
}
