import java.io.*;
import java.util.*;

public class Solution {
    public static int largestNumber(int[] arr){
        int max=0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return arr[max];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(largestNumber(arr));
    }
}