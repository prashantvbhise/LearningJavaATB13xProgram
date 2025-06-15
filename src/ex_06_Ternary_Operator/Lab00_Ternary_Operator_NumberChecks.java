package ex_06_Ternary_Operator;

public class Lab00_Ternary_Operator_NumberChecks {
    public static void main(String[] args) {
        int number = -18;
        // condition ? value_if_true : value_if_false;
        String numberChecks = number >= 0 ? "Postive" : "Negative";
        System.out.println(numberChecks);

    }
}
