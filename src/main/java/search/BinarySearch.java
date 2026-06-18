package search;

public class BinarySearch {

    public static boolean search(int[] arr, int target){

        return searchIteratively(arr,target);

    }


    private static boolean searchRecursively(int[] arr, int left, int right, int target){

        if (left > right) return false;
        int middle = left + (right - left) / 2;

        if (arr[middle] == target) return true;
        if (arr[middle] < target)
            return searchRecursively(arr, middle + 1, right, target);
        else
            return searchRecursively(arr, left, middle - 1, target);
    }

    private static boolean searchIteratively(int[] arr, int target){

        int left = 0;
        int right = arr.length -1;

        while (left <= right){

            //over flow safe vs (left + right) / 2
            int middle = left + (right - left) / 2;

            if (arr[middle] == target) return true;
            else if (arr[middle] < target) left = middle + 1;
            else right = middle - 1;

        }


        return false;
    }


}
