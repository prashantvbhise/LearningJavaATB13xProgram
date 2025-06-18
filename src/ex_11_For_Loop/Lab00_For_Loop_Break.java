package ex_11_For_Loop;

public class Lab00_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i == 5) {
                break; //Break the execution after if condition meet
                //continue; //continue => skip the code and move to next to top. So here 5 will not be printed
            } else {
                System.out.println(i);
            }
        }
    }
}
