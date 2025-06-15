package ex_06_Ternary_Operator;

public class Lab00_Ternary_Operator_CompareNumbers {
    public static void main(String[] args) {
        int a = 24;
        int b = 23;
        int c = 22;

        // condition ? value_if_true : value_if_false;
        // Rough Logic, Think about it.
        // a > b and a > c -> a
        // b > c and b > a -> b
        // c

       int result = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println(result);

    }
}
