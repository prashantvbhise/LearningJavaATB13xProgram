package ex_06_Ternary_Operator;

public class Lab00_Ternary_Operator {
    public static void main(String[] args) {
        int age = 18;
        // condition ? value_if_true : value_if_false;
        String canIVote = age >= 18 ? "Yes" : "No";
        System.out.println(canIVote);

    }
}
