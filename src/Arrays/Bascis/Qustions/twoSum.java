package Arrays.Bascis.Qustions;

public class twoSum {
    public static void main(String[] args) {


        int[]  arr = {5,2,7,1};
        int n = arr.length;
        int x = 9;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[i+1]==x){
                    System.out.println(arr[i] + " " + arr[j]);

                }
            }

        }
    }
}
