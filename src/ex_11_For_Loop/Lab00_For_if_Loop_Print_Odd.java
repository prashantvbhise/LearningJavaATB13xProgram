package ex_11_For_Loop;

public class Lab00_For_if_Loop_Print_Odd {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);

            }
            j++;

        }
        System.out.println("Total Odd number count is " + j);
    }
}
