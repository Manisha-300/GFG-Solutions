// User function Template for Java

class Solution {
     static int radixsort(int []arr,int n,int exp){
        int output[]=new int[n];
        int count[]=new int[10];
        for(int i=0;i<10;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
        return 0;
    }
    static void radixSort(int arr[], int n) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int exp=1;max/exp>0;exp*=10){
            radixsort(arr,n,exp);
        }
    
    }
}
