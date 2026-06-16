package sort;



/*Bubble sort

Best: O(n) · Average: O(n²) · Worst: O(n²)
Space: O(1) · Stable: yes*/



public class BubbleSort {

    // 2, 4, 1, 8, 10
    /*
    i=0, j=1 if i> j swap(i,j) i++ j++


    * */
    public static void sort(int[] arr){

        for (int i=0; i< arr.length; i++){
            int j= 0;
            boolean swapped = false;

            while(j +1 < arr.length - i){
                if(arr[j] > arr[j+ 1]){
                    swap(j, j+ 1, arr);
                    swapped = true;

                }
                j++;

            }
            if (!swapped) return;

        }


    }

    private static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }


}
