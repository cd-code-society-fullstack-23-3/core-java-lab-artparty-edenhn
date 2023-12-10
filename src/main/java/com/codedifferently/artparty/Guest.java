package com.codedifferently.artparty;

public class Guest {
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String reasonForVisit;

    public Guest( String firstName, String lastName, String email, String phoneNumber, String reasonForVisit){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.reasonForVisit = reasonForVisit;
    }

    //this constructor's only job is to make sure these fields are not null;
    public Guest(){
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.phoneNumber = "";
        this.reasonForVisit = "";
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    @Override
    public String toString(){
        return String.format("FirstName:%s; LastName:%s; Email:%s; PhoneNumber:%s; ReasonForVisit:%s",
              firstName, lastName, email, phoneNumber, reasonForVisit);
    }

}
