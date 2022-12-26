package SearchingandSorting;
//TIME COMPLEXITY=O(log n)
public class BinarySearch {
    //Half interval search
    //Find postion of targeted value within sorted Array
    //Prerequisite-> must be sorted
    public static int BinarySearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(numbers[mid]==key){//key found
                return mid;
            }
            if(numbers[mid]<key){//2nd half Right conditon
                start=mid+1;

            }
            else{//if(numbers[mid]>key) Left condition
                end=mid-1;

            }
        }
        return -1;//key is not present in Array
    }



    public static void main(String[] args) {
        int arr[]={5,10,15,20,30,35,46,99};
        int k=35;
        System.out.println("The index of "+k+" is "+BinarySearch(arr,k));

    }
}
