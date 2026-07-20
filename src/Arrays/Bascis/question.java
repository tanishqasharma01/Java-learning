package Arrays.Bascis;

public class question {
    public static void main(String[] args) {
        int[] arr = {10,40,50,60,70,20,10,5,};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] < 35){
                System.out.println(i);
            }
        }

    }
}
