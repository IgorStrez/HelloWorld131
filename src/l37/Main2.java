package l37;

import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main2 {
    public static void main(String[] args) {
        // Превратить массив чисел в строку разделенную запятыми


        String result = IntStream.range(0, 42)  // источник
                .mapToObj(i -> String.valueOf(i))  // промежуточная опрерация
                .collect(Collectors.joining(","));  // терминальная операция


        System.out.print(result);
    }
}
