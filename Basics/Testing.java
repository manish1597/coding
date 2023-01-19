package Basics;

import java.util.Scanner;

public class Testing {
   public static boolean prime(int n ){
       if(n==1) return false;
       if(n==2 || n==3 ) return true;
       if(n%2==0 || n%3==0) return false;
       for( int i=5;i*i<n;i=i+6 ){
           if(n%i==0 || n%(i+2)==0){
               return false;
           }
       }
       return true;
   }
   public static void primerange(int n){
       for(int i=2;i<=n;i++){
           if(prime(i)){
               System.out.print(i+" ");
           }
       }
   }
   public static void Primefactors(int n){
       for (int i=2;i<n;i++){
           if(prime(i)){
              int  x=i;
               while(n%x==0){
                   System.out.println(i+" ");
                   x=x*i;
               }
           }
       }
   }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to check prime or not:");
        int n = sc.nextInt();
//        System.out.println("Prime: "+isprime(n) );
          //System.out.println("Prime: "+ prime(n));//optimize method
        //System.out.println("The prime range is");
       // primerange(n);
       // System.out.println("The prime Factors are");
        Primefactors(n);



    }
}
