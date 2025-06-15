package ex_05_TypeCasting;

public class Lab00_TypeCasting_Widening {
    public static void main(String[] args) {

        byte b = 10;
        int a = b; //widening -> implicit casting
        int a1 = (int) b; //widening -> explicit casting
        System.out.println(b);
        System.out.println(a1);
    }
}
