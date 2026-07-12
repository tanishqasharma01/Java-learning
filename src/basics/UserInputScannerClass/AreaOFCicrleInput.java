package basics.UserInputScannerClass;

import java.util.Scanner;

public class AreaOFCicrleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius r :");
        int r = sc.nextInt();
        double area = 3.14*r*r;
        System.out.println("Area of circle is : " + area);
    }
}
