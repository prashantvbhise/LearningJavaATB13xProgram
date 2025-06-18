package ex_11_For_Loop;

public class Lab00_For_Loop_Int_Que {
    public static void main(String[] args) {
        // for ( I ; C ; U )
       // for (int i=0; ;i++)   // (infinite loop) exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
       // for(int i=0;i<10;i++) // exit code 0 - Successful
        for(int i=0; i>1; i++){ // here for loop will not be executed as i>1 will never happen in this case as i=0
            System.out.println(i);
        }
        System.out.println("End");
    }
}
