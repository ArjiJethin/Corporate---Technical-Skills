import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int i = 2;
        while (i <= num) {
            System.out.printf("%d\t", i);
            i += 2;
        }
    }
}
