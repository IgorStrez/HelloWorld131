package l37;

class Main001 {
    public static void main(String[] args) {
        int i = 10 / 0;
    }
}


class Main002 {
    public static boolean isInt(String str) {
        // try-catch блоку
        // NumberFormatException
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        // вернуть true если строчка сверху работает без ошибок
        // иначе вернуть false
    }

    public static void main(String[] args) {
        System.out.println(isInt("qwerty"));
        System.out.println(isInt("1234"));
        System.out.println(isInt("1234-1212"));
    }
}


public class Main3 {
    public static void main(String[] args) {
        try {
            // Этот код может вызвать ArithmeticException из-за деления на ноль
            System.out.println("Пытаемся поделить на 0");
            int result = 10 / 0;
            System.out.println("У нас удалось поделить на 0");
        } catch (ArithmeticException e) {
            // Этот код выполнится когда возникнет исключение ArithmeticException
            System.out.println("Произошла арифметическая ошибка");
        }
        finally {
            // Этот код выполнится всегда
            System.out.println("Блок finally выполнен.");
        }
    }

    // обязуем обработать исключение ArithmeticException при вызове метода.
    // если throws не указан - обработка необязательна
    public void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Доступ запрещен - вам меньше 18 лет.");
        } else {
            System.out.println("Доступ разрешен.");
        }
    }
}