package com.meng.model;

public class TestUser {
    private Integer id;

    private String name;

    private String gender;

    private Integer age;

    private String grade;

    private String profession;

    private String university;

    private String major;

    public TestUser(Integer id, String name, String gender, Integer age, String grade, String profession, String university, String major) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.profession = profession;
        this.university = university;
        this.major = major;
    }

    public TestUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university == null ? null : university.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }
}