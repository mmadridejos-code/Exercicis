package aisx.m3.uf1;

public class BitWiseExamples {
    public static void main(String[] args) {
        //Initial values
        int a = 5;
        int b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise Ca2
        // ~0101=1010
        // will give 2's complement of 1010 = -6
        //Ca2 = Ca1 +1
        //~0101=11111...111010 (int = 32 bits)
        //com és negatiu, calcula Ca2 = Ca1 +1 =101+1 (en negatiu) = -6

        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
}
