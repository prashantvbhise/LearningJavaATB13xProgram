package ex_13_Test;

public class Test_26th_June_Ch2 {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2= "hello";
        String s3= "Hello";

        System.out.println("equals(): " +(s1==s2 || s2==s3) + ", "+ "equalsIgnoreCase(): " +(s1.equalsIgnoreCase(s2)) + ", "+ "compareTo(): "+ (s3.compareTo(s2)));


    }
}
