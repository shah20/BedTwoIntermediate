package com.wipro.model;

import javax.persistence.*;

@Entity
@NamedQuery(name="User.findByEmailAndPassword",
            query="select u from User u where u.email = ?1 and u.password = ?2")
public class User {

    @Id
    String email;

    String firstname;
    String lastname;
    String password;
    String userType;

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
                + password + ", userType=" + userType + "]";
    }

    public User(String email, String firstname, String lastname, String password, String userType) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.userType = userType;
    }

    public User() {
        super();
    }
    
}
