package ArrayList.basics;
//NOTE : in arraylist you dont have deafault values , but in array you have zero as defualt value
import java.util.ArrayList;

public class basicOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10); // its is very important to initialize each and every ele otherwise it will you error in arraylist
        arr.add(1,20);//arr[2] = 20
        arr.add(2,30);// for initialize use ( add )
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        for(int i=0;i<5;i++){
            System.out.print(arr.get(i) + " "); // just like  arr[i]
        }
        System.out.println();
        arr.set(2,400); //modify
        for(int i=0;i<5;i++){
            System.out.print(arr.get(i)+ " ");
        }
        arr.add(90); //push back
        System.out.println();
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }





    }
}
