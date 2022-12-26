package Array;

public class MaxsubArraysubbyPrefixsum {
    static void Printsubmax(int n[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;

        int prefix[]=new int[n.length];
        prefix[0]=n[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+n[i];
        }
        for(int i=0;i<n.length;i++){
            int start=i;//2 comes in start
            for(int j=i;j<n.length;j++){
                int end=j;//here 2 comes in end
                currentsum=start==0?prefix[end] : prefix[end]-prefix[start-1];
                if(maxsum < currentsum) {
                    maxsum=currentsum;
                }

            }
        }
        System.out.println("Max sum ="+maxsum);
    }

    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        Printsubmax(n);

    }

}
