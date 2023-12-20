package org.example.entity;

import jakarta.persistence.*;

@Entity(name = "Student")
public class Student {
    public Student() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentRoll;
    @Column
    private String studentFirstName;
    @Column
    private String studentNameLastName;
    @Column
    private int studentAge;


    public Student(int studentRoll, String studentFirstName, String studentNameLastName, int studentAge) {
        this.studentRoll = studentRoll;
        this.studentFirstName = studentFirstName;
        this.studentNameLastName = studentNameLastName;
        this.studentAge = studentAge;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentNameLastName() {
        return studentNameLastName;
    }

    public void setStudentNameLastName(String studentNameLastName) {
        this.studentNameLastName = studentNameLastName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

}
