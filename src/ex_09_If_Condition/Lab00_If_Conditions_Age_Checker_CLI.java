package ex_09_If_Condition;

public class Lab00_If_Conditions_Age_Checker_CLI {
    public static void main(String[] args) {

            int age = Integer.parseInt(args[0]); // Input using CLI "Edit Run Configuration"
            if (age > 18){
                System.out.println("Yes you can go to GOA!");
            }else {
                System.out.println("You can't Go to GOA!!");
            }

    }
}
