package l37;

import java.util.List;
import java.util.Objects;


class Cat1 {
    public String name;


    public Cat1(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;


        Cat1 cat1 = (Cat1) o;


        return Objects.equals(name, cat1.name);
    }


    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }


    @Override
    public String toString() {
        return name;
    }
}




public class Main1 {
    public static void main(String[] args) {
        // Напечатать “Хэш таблицу” по коллекции объектов


        List<Cat1> cat1s = List.of(
                new Cat1("Marsik"),
                new Cat1("Barsik"),
                new Cat1("Masik"),
                new Cat1("Boris"),
                new Cat1("Matroskin")
        );


        cat1s.stream()  // источник, создаем начало конвеера
                .forEach(c -> System.out.println(c.hashCode() + " | " + c));


        System.out.println("------------");
        // или так


        cat1s.stream()  // источник
                .peek(c -> System.out.print(c.hashCode() + " | "))  // промежуточная операция
                .forEach(c -> System.out.println(c));  // терминальная операция


        // 9239293 | Marsik
        // 5849845 | Barsik
    }
}
