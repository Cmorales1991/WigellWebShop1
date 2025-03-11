package org.example.Model.Services;

public class Customer {
    private String id;
    private String firstname;
    private String lastname;
    private String address;
    private String email;

    public Customer(String id, String firstname, String lastname, String address, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}