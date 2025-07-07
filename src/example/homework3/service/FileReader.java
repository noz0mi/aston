package example.homework3.service;

import example.homework3.CustomFileNotFoundException;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader implements FileProcessor {

    public FileReader() {
    }

    @Override
    public void processFile(String fileName, Scanner scanner) throws CustomFileNotFoundException {
        while (fileName == null) {
            System.out.println("Введите непустое имя файла");
            fileName = scanner.next();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(fileName))) {
            String line = bufferedReader.readLine();
            while (!(line == null)) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new CustomFileNotFoundException("Файл с таким именем не найден");
        }
    }
}
