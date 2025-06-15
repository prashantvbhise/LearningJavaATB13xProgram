package ex_06_Ternary_Operator;

public class Lab00_Ternary_Operator_Odd_even {
    public static void main(String[] args) {
        int a = 31;
        // condition ? value_if_true : value_if_false;
        String result =(a%2==0)? "Even" : "Odd";
        System.out.println(result);

    }
}
