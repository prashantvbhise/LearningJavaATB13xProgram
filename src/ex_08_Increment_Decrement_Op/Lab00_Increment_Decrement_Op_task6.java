package ex_08_Increment_Decrement_Op;

public class Lab00_Increment_Decrement_Op_task6 {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;

        System.out.println("x = " + x + ", y = " + y);
    }
}
