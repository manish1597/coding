package Basics;

public class BinarytoDecimal {
    public static void binaryToDecimal(int bnum){
        int mynum=bnum;
        int pow =0;
        int decimal=0;
        while(bnum>0){
            int last_digit=bnum%10;
            decimal = decimal+(last_digit*(int)Math.pow(2,pow));
            pow++;
            bnum=bnum/10;
        }
        System.out.println("Binaary no. of "+mynum+"="+decimal);
    }

    public static void main(String[] args) {
        binaryToDecimal(100);
    }

}
