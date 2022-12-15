import java.util.Scanner;

public class pro5 {

    public static void main(String[] args) {

        int a;
        Scanner vg = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        a = vg.nextInt();

        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", a, i, a * i);
        }
    }
}
