package Exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give us a number:");
        int x = scanner.nextInt();


            if (Prime(x)) {
                System.out.println("Prime");
            } else if (x==0) {
                System.out.println("take care");
                break;
            } else {
                System.out.println("Not Prime");
            }
        }
    }

    private static boolean Prime(int x) {

        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}