package com.faeddalberto.domain;

public class User {

    private String email;

    private String username;

    private String firstname;

    private String lastname;

    public User(String email, String username, String firstname, String lastname) {
        this.email = email;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return com.google.common.base.Objects.equal(email, user.email) &&
                com.google.common.base.Objects.equal(username, user.username) &&
                com.google.common.base.Objects.equal(firstname, user.firstname) &&
                com.google.common.base.Objects.equal(lastname, user.lastname);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(email, username, firstname, lastname);
    }
}
