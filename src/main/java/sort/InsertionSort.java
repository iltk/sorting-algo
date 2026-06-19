package sort;


import java.util.List;

/*Insertion sort

Best: O(n) · Average: O(n²) · Worst: O(n²)
Space: O(1) · Stable: yes*/
public class InsertionSort {

    /* 4,3,9,8,1  nextValue= 9, j = i- 1(i = 3, j= 2)
    4, 3, 9, 9, 1 nextValue= 9, j = 1, i=2


    1) i=1,  nextValue = arr[i](3)

    for (int j = 0; j < arr.length; j++)
        1) j =0
        if(arr[j](4) > 3)
            arr[j + 1] = arr[j]
            4, 4,

     */

    public static void sort(int[] arr){

            for (int i=1; i < arr.length; i++){

                int nextValue = arr[i];
                int j = i - 1;

                while(j >= 0 && arr[j] > nextValue){
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j+ 1] = nextValue;

            }
        }

}
