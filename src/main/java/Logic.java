import model.Course;
import model.Discipline;
import model.User;

import java.util.*;

public class Logic {

    public static void main(String[] args) {

        Course course = new Course("J2EE Developer");

        List<Discipline> listOfDiscipline = new ArrayList<>();

        listOfDiscipline.add(new Discipline("Технология Java Servlets", 8));
        listOfDiscipline.add(new Discipline("Struts Framework", 24));

        course.setDisciplineList(listOfDiscipline);
        User user = new User("Denis","Protasov",course,new int[]{3,4,5,1,1});


        System.out.println(user.getName() + " " + user.getSurName() + " - Начало курса по программе " + user.getCourse().getName()
                + ". Его оценки "+ Arrays.toString(user.getMarks()));

        Calendar calendar;
        calendar = Calendar.getInstance();
        Date date = new Date(1995,5,19);
        calendar.setTime(date);
//        Date date = calendar.getTime();
        System.out.println(date);

      calendar.add(Calendar.DAY_OF_YEAR,10);

      Date date1 = calendar.getTime();
        System.out.println(date1);



    }


}
