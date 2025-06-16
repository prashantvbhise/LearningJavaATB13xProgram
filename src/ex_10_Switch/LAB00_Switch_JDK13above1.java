package ex_10_Switch;

public class LAB00_Switch_JDK13above1 {
    public static void main(String[] args) {
        // in JDK > 13
        //  No need of break keyword
        // one line supported.

        int itemcode =007;
        switch (itemcode){
            case 001,002,003 -> System.out.println("Match");
            case 004,005,006 -> System.out.println("No Match");
            default -> System.out.println("default");
        }

    }
}
