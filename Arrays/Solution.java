import java.util.*;

public class Solution {
    static void moveZeros(int arr[], int n) {
        int zero = 0; 
        int nonZero = 0;
        while (nonZero < n) {
            if (arr[nonZero] != 0) {
                int temp = arr[nonZero];
                arr[nonZero] = arr[zero];
                arr[zero] = temp;
                zero++;
            }
            nonZero++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        moveZeros(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}