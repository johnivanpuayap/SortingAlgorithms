import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {

    static ArrayList<Integer> arrayList;
    public static void InsertionSort(ArrayList<Integer> arr){
        int steps = 1;

        for(int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && key < arr.get(j)) {
                arr.set(j+1, arr.get(j));
                --j;
                System.out.println("Step " + steps + ": " + arr);
                steps++;
            }
            arr.set(j + 1, key);
        }
    }
    public static void BubbleSort(ArrayList<Integer> arr) {
        int steps = 1;
        for(int i = 0; i < arr.size() - 1; i++) {
           for(int j = 0; j < arr.size() - i - 1; j++) {
               if(arr.get(j) > arr.get(j+1)) {
                   Collections.swap(arr, j, j+1);
                   System.out.println("Step " + steps + ": " + arr);
                   steps++;
               }
           }
        }
    }

    public static void BinaryInsertionSort(ArrayList<Integer> arr) {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        arrayList = new ArrayList<>();
        System.out.print("Enter number of integers you will add: ");
        int size = scan.nextInt();

        for(int i = 1 ; i <= size; i++) {
            System.out.print("Enter a number: ");
            arrayList.add(scan.nextInt());
        }

        System.out.println("Before: " + arrayList);
        BubbleSort(arrayList);
        System.out.println("After: " + arrayList);
    }
}
