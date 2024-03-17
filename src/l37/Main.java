package l37;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String[] strings = {"Lorem",  "ipsum",  "dolor",  "sit",  "amet", "consectetur",  "adipiscing",  "elit,",
                "sed",  "do", "eiusmod",  "tempor",  "incididunt",  "ut",  "labore",  "et",  "dolore",  "magna",
                "aliqua.",  "Ut", "enim",  "ad",  "minim",  "veniam,",  "quis",  "nostrud",  "exercitation",
                "ullamco",  "laboris", "nisi",  "ut",  "aliquip",  "ex",  "ea",  "commodo",  "consequat.",  "Duis",
                "aute",  "irure",  "dolor",  "in", "reprehenderit",  "in",  "voluptate",  "velit",  "esse",  "cillum",
                "dolore",  "eu",  "fugiat",  "nulla", "pariatur.",  "Excepteur",  "sint",  "occaecat",  "cupidatat",
                "non",  "proident,",  "sunt", "in",  "culpa",  "qui",  "officia",  "deserunt",  "mollit",  "anim",
                "id",  "est",  "laborum."
        };
        long dolorCount = Stream
                .of(strings)  // источник
                .filter(s -> s.contains("dolor"))  // промежуточная операция
                .count();  // терминальная операция подсчета количества


        System.out.println("Dolor count: " + dolorCount);
    }
}
