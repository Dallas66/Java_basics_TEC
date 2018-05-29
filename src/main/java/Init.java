import model.Course;
import model.Discipline;
import model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Init {

    private Random rnd = new Random();
    private List<Discipline> disciplines = new ArrayList<>();
//    private List<Course> courses = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private Course course1;
    private Course course2;

    public List<User> getUsers() {
        return users;
    }

//    public List<Course> getCourses() {
//        return courses;
//    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void initDisciplineList() {
        disciplines.add(new Discipline("Технология Java Servlets", randomDuration()));
        disciplines.add(new Discipline("Struts Framework", randomDuration()));
        disciplines.add(new Discipline("Spring Framework", randomDuration()));
        disciplines.add(new Discipline("Hibernate", randomDuration()));
        disciplines.add(new Discipline("Обзор технологий Java", randomDuration()));
        disciplines.add(new Discipline("Библиотека JFC/Swing", randomDuration()));
        disciplines.add(new Discipline("Технология JDBC", randomDuration()));
        disciplines.add(new Discipline("Технология JAX", randomDuration()));
        disciplines.add(new Discipline("Библиотеки commons", randomDuration()));
    }

    public void initCourse() {
//        courses.add(new Course("J2EE Developer",randomDiscipline()));
//        courses.add(new Course("Java Developer",randomDiscipline()));
        course1 = new Course("J2EE Developer",randomDiscipline());
        course2 = new Course("Java Developer",randomDiscipline());
    }

    public void initUser(){
        users.add(new User("Denis Protasov",
                course1,
                new Date(),
                randomMarks(course1)));
        users.add(new User("Rustam Mirgazizov",
                course2,
                new Date(),
                randomMarks(course1)));
        users.add(new User("Anatoliy Vasserman",
                course2,
                new Date(),
                randomMarks(course1)));

    }


    private int randomDuration() {

        return (rnd.nextInt(4) + 1) * 8;
    }

    private ArrayList<Discipline> randomDiscipline() {
        ArrayList<Discipline> returnedList = new ArrayList<>();
        int courseLength = rnd.nextInt(8) + 1;

        for (int i = 0; i <= courseLength;i++) {
            Discipline discipline = disciplines.get(ThreadLocalRandom.current().nextInt(disciplines.size()));
            if (!returnedList.contains(discipline)) {
                returnedList.add(discipline);
            }
        }

        return returnedList;
    }

    private ArrayList<Integer> randomMarks(Course course){
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i <= rnd.nextInt(Calc.coursesDurationDays(course)); i++){
            marks.add(rnd.nextInt(5)+1);
        }
        return marks;
    }



//    private int courseDurations(){
//        int j2eeDuration = 0;
//        int javaDuration = 0;
//
//        for(Course course : courses){
//            if (course.getName().equals("J2EE Developer")){
//                for(Discipline discipline : course.getDisciplineList()){
//                     j2eeDuration += discipline.getDurations();
//                }
//                return j2eeDuration;
//            }else if (course.getName().equals("Java Developer")){
//                for(Discipline discipline : course.getDisciplineList()){
//                    javaDuration += discipline.getDurations();
//                }
//                return javaDuration;
//            }
//        }
//        return 1;
//    }

}

