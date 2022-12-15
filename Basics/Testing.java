package Basics;

public class Testing {
    public static void main(String[] args) {
        System.out.println("Is 32 prime : "+isPrime(32));
        System.out.println("Is 41 prime : "+isPrime(41));
    }

    public static boolean isPrime(int num) {
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
