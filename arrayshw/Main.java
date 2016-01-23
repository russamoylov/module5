package arrayshw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[10];
        Scanner in = new Scanner(System.in);
        int k = 0;
        System.out.println("Please enter your array ");
        while (k < array.length){
            array [k] = in.nextInt();
            k++;
        }
        Find find = new Find();
        find.getMin(array);
        find.getMax(array);
        System.out.println("The minimum value of your array is " + find.getMin(array)
                            + "; " + "The maximum value of your array is " + find.getMax(array));
        Sort sort = new Sort();
        sort.sortArr(array);
        array = sort.sortArr(array);
        int i = 0;
        System.out.println("Your sorted array is ");
        while (i < array.length){
            System.out.print(array [i] + " ");
          i++;
        }

    }
}
