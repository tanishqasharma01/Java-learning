package basics.UserInputScannerClass;
import java.util.Scanner;
public class InputSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your n :" );
        int n = sc.nextInt();
        System.out.println("area of Square is : " + n*n);

    }
}
