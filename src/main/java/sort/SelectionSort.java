package sort;

/*Selection sort

Best: O(n²) · Average: O(n²) · Worst: O(n²)
Space: O(1) · Stable: no */


public class SelectionSort {


    //4,3,1,8,9
    // min i = 0;
    /*
    for int i=0; i < arr.length; i++
        minIndex = i;

        for (int j = i+ 1; j< arr.length; j++){
             if(arr[minIndex] > arr[j])
                minIndex = j;
        }


        swap(j; minIndex, arr);

    */



    public static void sort(int[] arr){

        for (int i=0; i < arr.length; i++){
            int minIndex = i;

            for (int j = i+ 1; j< arr.length; j++){
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }

            swap(i, minIndex, arr);
        }







    }


    private static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }

}
