import java.util.Scanner;

public class pro6 {

    public static void main(String[] args) {

        int num;
        Scanner sp = new Scanner(System.in);
        System.out.println("Enter Any one Value : ");
        num = sp.nextInt();

        if (num > 0) {
            System.out.println(num + " is POSITIVE NUMBER.");
        } else if (num < 0) {
            System.out.println(num + " is NEGATIVE NUMBER.");
        } else {
            System.out.println(num + " is a ZERO.");
        }
    }
}