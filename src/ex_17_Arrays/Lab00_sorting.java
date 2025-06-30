package ex_17_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab00_sorting {
    public static void main(String[] args) {
        int[] marks = {91, 41, 67, 87, 67};
        Arrays.sort(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        //System.out.println(marks); // print Ref Address and not value
    }
}
