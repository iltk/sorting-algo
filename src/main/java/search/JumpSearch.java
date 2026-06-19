package search;
/*
Time: O(√n) — about √n jumps in phase 1, then up to √n steps in phase 2
Space: O(1)

It's mainly useful when jumping backward is expensive —
e.g. data on a medium where seeking back costs more than seeking forward (tape, some linked structures),
since unlike binary search it only ever jumps forward and scans forward.
On a normal in-memory array, binary search's O(log n) beats it.

*/

public class JumpSearch {

    public static boolean search(int[] arr, int target){
        int length = arr.length;
        if (length == 0) return false;

        int step = (int) Math.sqrt(length);
        if (step == 0) step = 1;

        int nextBlock = step;
        int start  = 0;

        while (arr[Math.min(nextBlock, length) - 1] < target) {
            start = nextBlock;
            nextBlock += step;
            if (start >= length) return false;
        }

        while (start < Math.min(nextBlock, length)) {
            if (arr[start] == target) return true;
            start++;
        }

        return false;
    }
}