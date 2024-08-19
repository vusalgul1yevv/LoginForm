package com.company.loginform.dto;

public class UserDTO {
    private String name;
    private String lastname;
    private String email;

    public UserDTO() {
    }

    public UserDTO(String name, String lastname, String email){
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

