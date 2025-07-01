package example.homework3.service;

import example.homework3.CustomFileNotFoundException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter implements FileProcessor {

    public FileWriter() {
    }

    @Override
    public void processFile(String fileName, Scanner scanner) throws CustomFileNotFoundException {
        while (fileName == null) {
            System.out.println("Введите непустое имя файла");
            fileName = scanner.next();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter(fileName, true))) {
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
