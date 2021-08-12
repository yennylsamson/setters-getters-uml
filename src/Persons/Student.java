package Persons;

import Persons.Person;

public class Student extends Person {
    protected String password;
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int student_id) {
        this.id = student_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String student_last_name) {
        this.last_name = student_last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String student_first_name) {
        this.first_name = student_first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String student_middle_name) {
        this.middle_name = student_middle_name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char student_sex) {
        this.sex = student_sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String student_email) {
        this.email = student_email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int student_phoneNumber) {
        this.phoneNumber = student_phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String student_address) {
        this.address = student_address;
    }
}
