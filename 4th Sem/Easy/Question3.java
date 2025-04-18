import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int i = 1;
        while (i <= num) {
            System.out.printf("%d\t", i);
            i += 2;
        }
    }
}