package Arrays.Bascis;
import java.util.Arrays;

public class buildInMethods {
    public static void main(String[] args) {
        int[] arr = {10,20,30,29,89};
        //for each loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
