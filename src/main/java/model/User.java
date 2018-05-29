package model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class User {

    private String name;
    private Course course;
    private Date date;
    private List<Integer> marks;

    public User(String name, Course course, Date date, List<Integer> marks) {
        this.name = name;
        this.course = course;
        this.date = date;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", date=" + date +
                ", marks=" + marks +
                '}';
    }
}
