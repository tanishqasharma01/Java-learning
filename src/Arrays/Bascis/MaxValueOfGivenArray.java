package Arrays.Bascis;

public class MaxValueOfGivenArray {
    public static void main(String[] args) {
        int[] arr = {-67,-88,-33,-44,-12,-10,-5,-6,-99};
        int n = arr.length;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
                i++;
            }
        }
        System.out.println("max value is : " + max);
    }
}
