package example.homework3;

import example.homework3.service.FileReader;
import example.homework3.service.FileWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите абсолютный путь к файлу для чтения");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        try {
            new FileReader().processFile(inputString, scanner);
            System.out.println("Хотите записать в файл? Y/N");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y"))
                new FileWriter().processFile(inputString, scanner);
        } catch (CustomFileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Программа завершена.");
    }
}
