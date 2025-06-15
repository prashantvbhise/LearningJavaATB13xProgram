package ex_06_Ternary_Operator;

public class Lab00_Ternary_Operator_Max_Min {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        // condition ? value_if_true : value_if_false;
        int biggerNumber = a >= b ? a : b;
        System.out.println(biggerNumber);

    }
}
