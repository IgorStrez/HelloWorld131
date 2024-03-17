package l43;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) {
        String fileName = "resources/13.txt";

        // Запись строки в файл
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(fileName))) {
            String message = "Hello world, I’m Igor";
            writer.println(message);
            System.out.println("Строка успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
            e.printStackTrace();
        }

        // Чтение файла и вывод его содержимого
        try (FileInputStream fis = new FileInputStream(fileName)) {
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Содержимое файла: " + line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла.");
            e.printStackTrace();
        }
    }
}
