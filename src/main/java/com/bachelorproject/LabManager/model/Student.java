package com.bachelorproject.LabManager.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Student class with all necessary information
 */
@Entity // mapped to database
public class Student implements Serializable {  // helps transform class to types of streams
    @Id // key for database
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)

    /* attributes */
    private long id;
    private String mtrNumber;
    private String name;
    private String email;
    private String course;
    private String imageURL;

    /* constructor */
    public Student() {
    }

    public Student(long id, String mtrNumber, String name, String email, String course, String imageURL) {
        this.id = id;
        this.mtrNumber = mtrNumber;
        this.name = name;
        this.email = email;
        this.course = course;
        this.imageURL = imageURL;
    }

    /* getter setter */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMtrNumber() {
        return mtrNumber;
    }

    public void setMtrNumber(String mtrNumber) {
        this.mtrNumber = mtrNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    /* methods */

}
