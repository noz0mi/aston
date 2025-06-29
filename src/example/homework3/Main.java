package example.homework3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите абсолютный путь к файлу для чтения");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        try {
            readFromFile(inputString);
            System.out.println("Хотите записать в файл? Y/N");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y"))
                writeToFile(inputString, scanner);
        } catch (CustomFileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Программа завершена.");
    }

    public static void readFromFile(String  fileName) throws CustomFileNotFoundException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line = bufferedReader.readLine();
            while (!(line == null)) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new CustomFileNotFoundException("Файл с таким именем не найден");
        }
    }

    public static void writeToFile(String fileName, Scanner scanner) throws CustomFileNotFoundException {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            System.out.println("Введите данные для записи в файл");
            String line = scanner.next();
            System.out.println("Для завершения записи в файл введите \"stop\" ");
            while (!(line.equalsIgnoreCase("stop"))) {
                bufferedWriter.write(line);
                line = scanner.next();
            }
        } catch (IOException e) {
            throw new CustomFileNotFoundException("Файл с таким именем не найден");
        }
    }
}
