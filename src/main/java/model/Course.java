package model;


import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Course {

    private String name;
    private List<Discipline> disciplineList;
//    private Map<Discipline,Integer> course;
//    private Discipline discipline;
//    private int marks;
    private Date startDate;
    private Date endDate;

    public Course(String name) {
        this.name = name;
    }

//    public Map<Discipline, Integer> getCourse() {
//        return course;
//    }
//
//    public void setCourse(Map<Discipline, Integer> course) {
//        this.course = course;
//    }

//    public Discipline getDiscipline() {
//        return discipline;
//    }

//    public void setDiscipline(Discipline discipline) {
//        this.discipline = discipline;
//    }

//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Discipline> getDisciplineList() {
        return disciplineList;
    }

    public void setDisciplineList(List<Discipline> disciplineList) {
        this.disciplineList = disciplineList;
    }
}
