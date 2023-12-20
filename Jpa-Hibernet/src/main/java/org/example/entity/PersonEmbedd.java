package org.example.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;

@Embeddable
public class PersonEmbedd {

    private String personName;
    private String getPersonMail;

    public PersonEmbedd() {
    }

    @Override
    public String toString() {
        return "PersonEmbedd{" +
                "personName='" + personName + '\'' +
                ", getPersonMail='" + getPersonMail + '\'' +
                '}';
    }

    public PersonEmbedd(String personName, String getPersonMail) {
        this.personName = personName;
        this.getPersonMail = getPersonMail;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getGetPersonMail() {
        return getPersonMail;
    }

    public void setGetPersonMail(String getPersonMail) {
        this.getPersonMail = getPersonMail;
    }
}
