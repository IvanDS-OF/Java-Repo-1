
public class OperadoresLogicos1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c = 0;

        boolean d = a > b;
        boolean e = b < c;
        boolean f = (c+3) > a;

        boolean op1 = d && e;
        boolean op2 = f && e;
        boolean op3 = (d || f) && (!e || f);
        System.out.println("Op1: " + op1);
        System.out.println("Op2: " + op2);
        System.out.println("Op3: " + op3);
    }
}