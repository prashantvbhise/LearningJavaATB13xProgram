package ex_17_Arrays;

import java.util.Arrays;

public class Lab00_Min_Max_number {
    public static void main(String[] args) {
        int[] a = {1, 34, 21, 47, 93, 0, 10};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int max_number= return_max(a);
        int min_number= return_min(a);
        System.out.println(max_number);
        System.out.println(min_number);
       }

    static int return_min(int[] a) {
        int min =a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min= a[i];
            }
        }
        return min;
    }

    static int return_max(int[] a){
        int max= a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
       }

}
