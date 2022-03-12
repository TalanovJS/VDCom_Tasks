package Task_1;

import java.util.Scanner;
/*
New class and Static method
 */
public class Vers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        SomeInt.result(x);
        scanner.close();
    }
}

class SomeInt{
    public static void result(int x) {
        for (int i = 1; i <= x; i++) {
            if((i % 3 + i % 5) == 0){
                System.out.println("FooBar");
                continue;
            }
            if(i % 3 == 0){
                System.out.println("Foo");
                continue;
            }
            if(i % 5 == 0){
                System.out.println("Bar");
            } else {
                System.out.println(i);
            }
        }
    }
}

