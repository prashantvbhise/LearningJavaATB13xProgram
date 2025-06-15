package ex_04_Operators;

public class Lab00_Operators_Logical {
    public static void main(String[] args) {

        // && (Logical AND) -> Returns true only if both operands are true.
        // || (Logical OR)  -> Returns true if at least one operand is true.
        // ! (Logical NOT) -> Reverses the value of a boolean.
        // ^ (Logical XOR – Exclusive OR) -> Returns true if exactly one operand is true.

        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c= true || false ;
        System.out.println(c);

        boolean d = false ^ true;
        System.out.println(d);
    }
}
