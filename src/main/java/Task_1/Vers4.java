package Task_1;

import java.util.Scanner;
/*
Static method + recursion + if statments
 */

public class Vers4 {
    public static void main(String[] args) {
        //От 1
        int a = 1;

        //До
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        System.out.println("----------");
        System.out.println(recursion(a,count));

        scanner.close();
    }

    public static String recursion(int a, int b) {
        if (a == b && a % 15 == 0) {
            return "FooBar";
        } else if (a % 5 == 0) {
            return "Bar \n" + recursion(a + 1, b);
        } else if (a % 3 == 0) {
            return "Foo \n" + recursion(a + 1, b);
        } else {
            return a + " \n" + recursion(a + 1, b);
        }
    }
}

