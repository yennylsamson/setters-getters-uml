package Persons;

import Persons.Person;

public class Admin extends Person {
    protected String username;
    protected String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int admin_id) {
        this.id = admin_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String admin_last_name) {
        this.last_name = admin_last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String admin_first_name) {
        this.first_name = admin_first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String admin_middle_name) {
        this.middle_name = admin_middle_name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char admin_sex) {
        this.sex = admin_sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String admin_email) {
        this.email = admin_email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int admin_phoneNumber) {
        this.phoneNumber = admin_phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String admin_address) {
        this.address = admin_address;
    }
}
