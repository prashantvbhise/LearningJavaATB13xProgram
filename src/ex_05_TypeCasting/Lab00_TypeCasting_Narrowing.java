package ex_05_TypeCasting;

public class Lab00_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b1 = val; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte b1 = (byte)val; // Narrowing (int -> byte) - Explicit Casting is not allowed.
        System.out.println(b1);
    }
}
