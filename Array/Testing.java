package Array;

import java.util.Scanner;

public class Testing {
    public static void reverse(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int arr[]={5,10,15,20,30,35,46,79};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
