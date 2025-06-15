package ex_05_TypeCasting;

public class Lab00_TypeCasting_Narrowing_Task {
    public static void main(String[] args) {
        double A = 100.00;
        //byte b1 = val; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        //byte b1 = (byte)val; // Narrowing (int -> byte) - Explicit Casting is not allowed.
        int B = (int)A;
        System.out.println(B);
    }
}
