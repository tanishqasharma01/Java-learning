package Arrays.Bascis;

public class SumOfArray {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
