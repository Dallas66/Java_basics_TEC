package model;

import java.util.List;


public class Course {

    private String name;
    private List<Discipline> disciplineList;

    public Course(String name, List<Discipline> disciplineList) {
        this.name = name;
        this.disciplineList = disciplineList;
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

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", disciplineList=" + disciplineList +
                '}';
    }
}
