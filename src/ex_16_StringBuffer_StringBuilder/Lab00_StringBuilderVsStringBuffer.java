package ex_16_StringBuffer_StringBuilder;

public class Lab00_StringBuilderVsStringBuffer {
    public static void main (String[] args){
        String s0= "Prashant";
        String s1="Bhise";
        StringBuffer sb= new StringBuffer("Prathamesh");
        sb.append(" Prashant Bhise");
        StringBuilder sb1 = new StringBuilder("Bhise");
        sb1.delete(1,3);
        System.out.println(s0 + "\n" + s1 + "\n" + sb + "\n" + sb1);
        System.out.println(sb1.reverse());


    }
}
