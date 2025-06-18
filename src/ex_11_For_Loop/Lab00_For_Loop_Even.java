package ex_11_For_Loop;

public class Lab00_For_Loop_Even {
    public static void main(String[] args) {
        int j=0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number");
                j++;
            }

        }
        System.out.println("Count of even number between 1 to 50 = " +j);
    }
}
