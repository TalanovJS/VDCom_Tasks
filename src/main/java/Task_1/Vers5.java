package Task_1;

import java.util.Scanner;
import java.util.stream.IntStream;
/*
Streams + lambda
 */

public class Vers5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println("-----");

        IntStream.range(1,x).forEach((e) -> {
            System.out.println((x % 3) == 0 && (x % 5) == 0 ? "FooBar" : (x % 3 == 0) ? "Foo" : (x % 5) == 0 ? "Bar" : x);
        });

        scanner.close();
    }
}
