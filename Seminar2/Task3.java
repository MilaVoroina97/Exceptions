package Seminars.Seminar2;
import java.util.Scanner;

public class Task3 {

    public void getUserString() {
        boolean flag = true;
        while (flag) {

                System.out.println("Введите текст:");
                Scanner scanner = new Scanner(System.in);
                String userString = scanner.nextLine();

                try {
                    if (userString.equals("")) {
                        throw new Exception();
                    }
                    System.out.println(userString);
                    flag = false;
                } catch (Exception e) {
                    {
                        System.out.println("Обратите внимание, что пустые строки вводить нельзя");
                    }

            }
        }
    }
}
    

