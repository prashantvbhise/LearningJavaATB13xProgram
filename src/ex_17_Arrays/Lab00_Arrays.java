package ex_17_Arrays;

public class Lab00_Arrays {
    public static void main(String[] args) {
        int[] marks = {90, 91, 92, 93};

        System.out.println(marks.length);
        System.out.println(marks[0] + "," + marks[3]);
        //System.out.println(marks[4]); //java.lang.ArrayIndexOutOfBoundsException
        String[] names ={"Prashant","Prathamesh","Pooja"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        boolean[] is_pass={true, false, false};
        System.out.println(is_pass[1]);
        System.out.println(is_pass[2]);

    }
}
