import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Задача №1
        {
            for (int b = 10; b > 0; b--) {
                System.out.println(b);
            }
            int i = 1;
            while (i <= 10) {
                System.out.println(i++);

            }
        }
        //Задача №2
        {
            for (int fridayReport = 7; fridayReport < 31; fridayReport = fridayReport + 7) {
                System.out.println("Сегодня пятница " + fridayReport + "-е число. Необходимо подготовить отчет.");
            }
        //Задача №3
            for (int trajectory = 0; trajectory <= 200; trajectory = trajectory + 79) {
                System.out.println("Комета пролетала " + trajectory);

            }
        }
    }
}

