import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int f1 = 0, f2 = 1;
        for (int i = 0; i < num; i++) {
            System.out.printf("%d\t", f1);
            int temp = f1;
            f1 = f1 + f2;
            f2 = temp;
        }
    }
}
