package org.example.Model;

public class Customer {
    private String id;
    private String firstname;
    private String address;
    private String email;

    public Customer(String id, String firstname, String address, String email) {
        this.id = id;
        this.firstname = firstname;
        this.address = address;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

}
