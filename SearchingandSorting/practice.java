package SearchingandSorting;

public class practice {
    public static int BinarySearch(int[] arr, int k){
        int start = 0;
        int end =arr.length-1;
        while (start<=end){//Start <= end because if array has only one element
            int mid=(start+end)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(k<arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={5,10,15,20,30,35,46,99};
        int k=99;
        System.out.println("The index of "+k+" is "+BinarySearch(arr,k));

    }

}
