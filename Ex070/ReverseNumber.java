package Ex070;

class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Hello worldJoe!");
        System.out.println( reverseInteger(-12345));
    }
    public  static int reverseInteger(int N){
       int reverse = 0;
       N = Math.abs(N);
       while (N>0) {
           reverse =reverse*10 + N % 10;
           N /= 10;
       }



return reverse;
    }
}
/*
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public  static int reverseInteger(int N){

    }
}*/

