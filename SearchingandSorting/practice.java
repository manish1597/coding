package SearchingandSorting;

import java.util.concurrent.LinkedTransferQueue;

public class practice {

    public static void printarray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void selectionSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int small=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[small]>arr[j]){
                    small=j;

                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,7,1,8,11,3,2};
        selectionSort(arr);
        printarray(arr);

    }

}
