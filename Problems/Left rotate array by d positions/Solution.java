public class Solution{

    public static void reverse(int[] nums,int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;end--;
        }
    }

    public static int[] leftRotateKtimes(int[] arr,int k,int n){
        reverse(arr, 0, k-1);
        reverse(arr, k,n-1);
        reverse(arr, 0, n-1);
        return arr;
    }
    public static int[] rightRotateKtimes(int[] arr,int k,int n){
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }
    public static void main(String[] args) {
        int k = 4;
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={1,2,3,4,5,6};

        leftRotateKtimes(arr1, k, arr1.length);
        rightRotateKtimes(arr2, k, arr2.length);
        System.out.println("Left rotate");
       for(int i:arr1){
        System.out.print(i+" ");
       }
       System.out.println();
       System.out.println("Right rotate");
       for(int i:arr2){
        System.out.print(i+" ");
       }
    }
}

// int temp[]=new int[k];
//         for(int i=0;i<k;i++){
//             temp[i]=arr[i];
//         }
//         for(int i=0;i<n-k;i++){
//             arr[i]=arr[k+i];
//         }
//         for(int i=k;i>0;i--){
//             arr[n-i]=temp[k-i];
//         }