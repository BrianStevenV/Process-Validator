package com.makaia.validador.validador.Modules;

public class FileCSV {
    private String index;
    private String userId;

    private String firstName;
    private String lastName;
    private String sex;
    private String email;

    private String phone;
    private String dateOfBirth;
    private String jobTitle;
    public FileCSV(){}
    public FileCSV(String index, String userId, String firstName, String lastName, String sex, String email, String phone, String dateOfBirth, String jobTitle) {
        this.index = index;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.jobTitle = jobTitle;
    }

    public String getIndex() {
        return index;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
