package Seminars.Seminar2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public void getFloatNumber() {
        boolean toContinue = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(toContinue){
            System.out.print("Введите дробное число: ");
            try{

                float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно %f\n", fNumber);
                toContinue = false;

                } catch (IOException|NumberFormatException e) {
                    System.out.println("Введите, пожалуйста, именно ДРОБНОЕ число : ");
                }

            }
    }
    
}
