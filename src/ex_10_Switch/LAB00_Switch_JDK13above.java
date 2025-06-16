package ex_10_Switch;

public class LAB00_Switch_JDK13above {
    public static void main(String[] args) {
        // in JDK > 13
        //  No need of break keyword
        // one line supported.

        int itemcode =003;
        switch (itemcode){
            case 001 -> System.out.println("No Match");
            case 002 -> System.out.println("Match");
            default -> System.out.println("default");
        }

    }
}
