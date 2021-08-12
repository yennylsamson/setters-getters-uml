package Persons;

import Persons.Person;

public class Teacher extends Person {
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

    public void setId(int teacher_id) {
        this.id = teacher_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String teacher_last_name) {
        this.last_name = teacher_last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String teacher_first_name) {
        this.first_name = teacher_first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String teacher_middle_name) {
        this.middle_name = teacher_middle_name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char teacher_sex) {
        this.sex = teacher_sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String teacher_email) {
        this.email = teacher_email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int teacher_phoneNumber) {
        this.phoneNumber = teacher_phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String teacher_address) {
        this.address = teacher_address;
    }
}
