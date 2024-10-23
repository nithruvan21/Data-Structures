public class Solution{
    public static int[] leftRotateKtimes(int[] arr,int k,int n){
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[i]=arr[k+i];
        }
        for(int i=k;i>0;i--){
            arr[n-i]=temp[k-i];
        }
        return arr;
    }
    public static int[] rightRotateKtimes(int[] arr,int k,int n){
        
        return arr;
    }
    public static void main(String[] args) {
        int k = 6;
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(leftRotateKtimes(arr, k, arr.length));
       for(int i:arr){
        System.out.print(i+" ");
       }
    }
}