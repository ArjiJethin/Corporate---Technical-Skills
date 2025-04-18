import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number 2: ");
        int num2 = sc.nextInt();
        sc.close();
        for (int i = num1; i <= num2; i++) {
            System.out.printf("%d\t", i);
        }
    }
}