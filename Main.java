package by.minsk.itakademy.arturzimin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now().withDayOfMonth(19);
        //System.out.println(today);
        LocalDate specificDate = LocalDate.of(2012, 5, 2);
        //System.out.println(specificDate);


/**task 66*/
        LocalDate minus60Days = LocalDate.now().minusDays(60);
        LocalDate runtime = LocalDate.now();
        System.out.println("runtime " + runtime);
        ;
        System.out.println(" 60 days ago " + minus60Days);


        /**task 63*/

        List<Integer> listInt = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listInt.add(ThreadLocalRandom.current().nextInt(-200, 400));
        }


        boolean numbersDivisible = listInt.stream()
                .anyMatch(numbers -> numbers % 3 == 0 && numbers % 5 == 0);
        System.out.println("Are there numbers that are divisible by 3 and 5 = " + numbersDivisible);

        listInt.stream()

                .filter(a -> a.intValue() % 3 == 0 && a.intValue() % 5 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        



    }
}
