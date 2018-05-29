import model.User;

import java.util.*;

public class Logic {

    public static void main(String[] args) {

        Init init = new Init();
        init.initDisciplineList();
        init.initCourse();
        init.initUser();

        String requireName = "";


//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//             requireName = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        List<User> users = init.getUsers();

//        for (User user : users){
//            if (user.getName().equals(requireName)){
//
//            }else{
//                System.out.println("We cant find this user");
//            }
//        }

//        System.out.println(users.get(0).getMarks().size());
//        System.out.println(users.get(0).getMarks());
//
//        System.out.println(Calc.coursesDurationDays(users.get(0).getCourse()));
//        System.out.println(users.get(0).getCourse());
//
//        System.out.println(Calc.isUserGoHome(users.get(0),users.get(0).getCourse()));
//
//        System.out.println(Calc.coursesDurationHours(users.get(0).getCourse()));

        System.out.println(Calc.timeRemaning(users.get(0),users.get(0).getCourse()));
//        System.out.println(Calc.timeRemaning(users.get(1),users.get(1).getCourse()));
//        System.out.println(Calc.timeRemaning(users.get(2),users.get(2).getCourse()));

        System.out.println(users.get(0).getName() + " " + Calc.averageMark(users.get(0)) +
                " " + (Calc.isUserGoHome(users.get(0), users.get(0).getCourse()) ? "Отчислить":"Может продолжать обучение"));

        Calc.OnlyGoodGuyz(users);



//        Calc.sortByTimeRemaning(users);
//        System.out.println();
//        Calc.sortByAverageMark(users);












    }


}
