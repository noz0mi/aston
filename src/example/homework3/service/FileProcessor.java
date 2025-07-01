package example.homework3.service;

import example.homework3.CustomFileNotFoundException;

import java.util.Scanner;

public interface FileProcessor {
    void processFile(String fileName, Scanner scanner) throws CustomFileNotFoundException;
}
