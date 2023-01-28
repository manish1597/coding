package Recursion;

public class BinarySearch_Recursion {
    public static int BinarySearch(int arr[], int k,int start,int end ){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==k){
            return mid;
        }
        if(k<arr[mid]){
            return BinarySearch(arr,k,start,end-1);
        }
        return BinarySearch(arr,k,start+1,end);
    }

    public static void main(String[] args) {
        int arr[]={5,10,15,20,30,35,46,99};
        int k=99;
        System.out.println("The index of "+k+" is "+BinarySearch(arr,k,0, arr.length-1));

    }
}
