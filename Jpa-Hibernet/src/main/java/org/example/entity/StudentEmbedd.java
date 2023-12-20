package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_embedd")
public class StudentEmbedd {
    @EmbeddedId
    private PersonEmbedd personEmbedd;;

    @Column
    private int stuId;
    @Column
    private String stuName;



    StudentEmbedd(){}

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public PersonEmbedd getPersonEmbedd() {
        return personEmbedd;
    }

    public void setPersonEmbedd(PersonEmbedd personEmbedd) {
        this.personEmbedd = personEmbedd;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public StudentEmbedd(int stuId, String stuName, PersonEmbedd personEmbedd) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.personEmbedd = personEmbedd;
    }
}
