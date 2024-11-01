import java.util.*;

public class Solution{
    public static void longestSubarray(int[] nums, int k){
        int len = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0;
            for(int j = i ; j < nums.length ; j++){
                sum+=nums[j];
                if(sum==k){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        System.out.println("Longest Subarray with given sum k length: "+len);
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};//array
        int k = 14;
        longestSubarray(nums,k);
    }
}



// for(int i = 0 ; i < nums.length ; i++){
//     for(int j = i ; j < nums.length ; j++){
//         for(int r = i ; r <= j; r++){
//             System.out.print(nums[r]+" ");
//         }
//         System.out.println();
//     }
// } for printing subarrayss