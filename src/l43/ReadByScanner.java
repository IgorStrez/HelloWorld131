package l43;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;




public class ReadByScanner {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("resources/13.txt")
        ) {
            Scanner scanner = new Scanner(fis);
            while(scanner.hasNext()) {

                String line = scanner.nextLine();
                System.out.print(line);
            }
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }
    }
}