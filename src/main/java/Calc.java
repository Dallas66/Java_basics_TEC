import model.Course;
import model.Discipline;
import model.User;

import java.util.List;

public class Calc {

    public static double averageMark(User user){
        return user.getMarks().stream().mapToDouble(i -> i).sum() / user.getMarks().size();
    }

    public static void sortByAverageMark(List<User> users){
//        List<User> sortedList = new ArrayList<>(users);

        users.sort((o1, o2) -> {
            if (averageMark(o1) > averageMark(o2)) return -1;
            if (averageMark(o1) < averageMark(o2)) return 1;
            return 0;
        });
        for(User user : users ){
            System.out.println(user.getName() + " Average mark " + averageMark(user));
        }
    }

    public static void sortByTimeRemaning(List<User> users){
        users.sort(((o1, o2) -> {
            if (timeRemaning(o1,o1.getCourse()) > timeRemaning(o2,o2.getCourse())) return -1;
            if (timeRemaning(o1,o1.getCourse()) < timeRemaning(o2,o2.getCourse())) return 1;
            return 0;
        }));
        for (User user : users){
            System.out.println(user.getName() + " Time Remaning " + timeRemaning(user,user.getCourse()));
        }
    }

    public static boolean isUserGoHome(User user,Course course){
//        double current = user.getMarks().stream().mapToDouble(i -> i).sum();
//        int remainingDays  = coursesDurationDays(course) - user.getMarks().size();
        int remainingDays  = timeRemaning(user,course);
        int duration = coursesDurationDays(course);
        if (duration != 0) {
            return ((averageMark(user) + remainingDays * 5) / duration) < 4.5;
        }else {
            return true;
        }

    }

    public static int coursesDurationDays(Course course){
        int duration = 0;
        for (Discipline discipline : course.getDisciplineList()){
            duration += discipline.getDurations();
        }
        int workDayHour = 8;
        return duration / workDayHour;
    }

    public static int coursesDurationHours(Course course){
        int duration = 0;
        for (Discipline discipline : course.getDisciplineList()){
            duration += discipline.getDurations();
        }
        return duration;
    }

    public static int timeRemaning(User user, Course course){
        int hours = 0;
        for (Discipline discipline : course.getDisciplineList()) {
            hours += discipline.getDurations();
        }
        return (hours / 8) - user.getMarks().size();
    }


    public static void OnlyGoodGuyz(List<User> users){
        for (User user : users){
            if (!isUserGoHome(user,user.getCourse())){
                System.out.println(user.getName());
            }
        }
    }



}
