package ex_06_Ternary_Operator;

public class Lab00_Ternary_Operator_AgeChecker {
    public static void main(String[] args) {
        int age = 17;
        // condition ? value_if_true : value_if_false;
        String result =(age <=18)? "Minor": (age>=65)? "Senior" : "Adult";
        System.out.println(result);

    }
}
