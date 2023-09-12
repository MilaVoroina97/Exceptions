package Seminars.Seminar3;

import java.io.FileWriter;
import java.util.Scanner;

public class GetName {

    private String firstName;
    private String lastName;
    private String middleName;
    private String yearOfBirth;
    private long numberPhone;
    private char gender;
    private final Scanner scan = new Scanner(System.in);

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public char getGender() {
        return gender;
    }

 
    private void enterFirstName() {
        System.out.println("Enter first name:");
        firstName = scan.nextLine();
        if (firstName.equals("")) {
            throw new RuntimeException("Вводимое значение не может быть пустым,\nпопробуйте снова");
        }
    }

    private void enterLastName() {
        System.out.println("Enter last name:");
        lastName = scan.nextLine();
        if (lastName.equals("")) {
            throw new RuntimeException("Вводимое значение не может быть пустым,\nпопробуйте снова");
        }
    }

    private void enterMiddleName() {
        System.out.println("Enter middle name");
        middleName = scan.nextLine();
        if (middleName.equals("")) {
            throw new RuntimeException("Вводимое значение не может быть пустым,\nпопробуйте снова");
        }
    }

    private void enterYearOfBirth() {
        System.out.println("Enter year of birth:");
        yearOfBirth = scan.nextLine();
        if (yearOfBirth.equals("")) {
            throw new RuntimeException("Вводимое значение не может быть пустым,\nпопробуйте снова");
        }
    }

    private void enterNumberPhone() {
        try {
            System.out.println("Enter number phone:");
            String number = scan.nextLine();
            if (number.equals("")) {
                throw new RuntimeException("Вводимое значение не может быть пустым,\nпопробуйте снова");
            }
            numberPhone = Long.parseLong(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: нужно вводить цифры");
        }
    }

    private void enterGender() {
        System.out.println("Enter gender (f, m):");
        String gen;
        String f = "f";
        String m = "m";
        gen = scan.nextLine();
        if (gen.length() > 1) {
            throw new RuntimeException("Вы ввели слишком много символов \nпопробуйте снова!");
        }
        if (gen.equals(f) || gen.equals(m)) {
            gender = gen.charAt(0);
        } else {
            throw new RuntimeException("Введите символ f или m");
        }
    }


    private void outPutData() {
        System.out.println("\nFirst name \t- \t" + firstName + "\n" + "Last name \t- \t" + lastName + "\n" + "Middle name \t- \t" + middleName + "\n" + "Year of birth \t- \t" + yearOfBirth + "\n" + "Number phone \t- \t" + numberPhone + "\n" + "Gender   \t- \t" + gender);
    }


    private void dataEnter() {
        enterFirstName();
        enterLastName();
        enterMiddleName();
        enterYearOfBirth();
        enterNumberPhone();
        enterGender();
        outPutData();
    }


    public void saveDataEnter() {

        dataEnter();
        String file = "Seminars/Seminar3/Names/" + lastName + ".txt";
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("<" + firstName + "> " + "<" + lastName + "> " + "<" + middleName + "> " + "<" + yearOfBirth + "> " + "<" + numberPhone + "> " + "<" + gender + ">\n");
        } catch (Exception e) {
            System.out.println("Не удалось записать в файл.");
        }
    }
    
}
