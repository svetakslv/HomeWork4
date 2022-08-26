import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Задача №1
        {                                                 // Вариант решения от преподавателя:
            for (int b = 10; b > 0; b--) {                // int currentNum = 0;
                System.out.print(b + " ");                // while (currentNum < 10) {
            }                                             // System.out.print(++currentNum + " ");
            System.out.println(" ");                      // }
            int i = 1;                                    // System.out.println();
            while (i <= 10) {                             // for (;currentNum > 0; currentNum--) {
                System.out.print(i++ + " ");              // System.out.print(currentNum + " ");
                // }
            }
        }
        //Задача №2

        System.out.println(" ");                                                                                     //Вариант решения от преподавателя:
        {                                                                                                            // int firstFriday = 5;
            for (int fridayReport = 7; fridayReport < 31; fridayReport = fridayReport + 7) {                         // for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday = currentFriday +7) {
                System.out.println("Сегодня пятница " + fridayReport + "-е число. Необходимо подготовить отчет.");   // System.out.println("Сегодня пятница " + currentFriday + "-е число. Необходимо подготовить отчет.");
            }
            //Задача №3                                                                                              //Вариант решения от преподавателя:
            for (int trajectory = 0; trajectory <= 2100; trajectory = trajectory + 79) {                             // int currentYear = LocalDate.now().getYear();
                if (trajectory >= 1822) {                                                                            // int start = currentYear - 200;
                    System.out.println("Комета пролетала в " + trajectory + " году.");                               // int end = currentYear + 100;
                    // for (int year = start; year <= end; year++) {
                    // if (year % 79 == 0) {
                }                                                                                                    // System.out.println(year);
            }
        }
        //*Задача №4
        for (int i = 1; i < 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i + ":" + " ping");
            } else {
                if (i % 5 == 0) {
                    System.out.println(i + ":" + " pong");
                } else {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println(i + ":" + " ping pong");
                    } else {
                        if (i % 3 != 0 && i % 5 != 0) ;
                        System.out.println(i + ":" + " ");
                    }
                }
            }
        }
    }
        //*Задача №5

}




