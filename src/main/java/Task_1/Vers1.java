package Task_1;

import java.util.Scanner;

/*
For loop + if statments
 */
public class Vers1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            int x = scanner.nextInt();

            if( x < 1 ){
                throw new Exception("Введите число больше 0");
            }

            System.out.println("-------");

            for (int i = 1; i <= x; ++i) {
                if( (( i % 3 ) + ( i % 5 )) == 0 ){
                    System.out.println("FooBar");
                } else if( i % 3 == 0 ){
                    System.out.println("Foo");
                } else if( i % 5 == 0 ){
                    System.out.println("Bar");
                } else {
                    System.out.println(i);
                }
            }

            for (int i = 1; i <= x ; i++) {
                System.out.println((i % 3) == 0 && (i % 5) == 0 ? "FooBar": (i % 3 == 0) ? "Foo" : (i % 5) == 0 ? "Bar" : i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
