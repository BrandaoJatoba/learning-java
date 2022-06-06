public class booleans {
        
        public static void main(String arg[]){
        
        boolean a, b, c, d;
        a = true;
        b = true;
        c = false;
        d = false;

        if (a & b) System.out.println("a and b = true");
        if (a & c) System.out.println("a and c = true");
        if (a & d) System.out.println("a and d = true");
        if (c & d) System.out.println("C and D = true");
        
        System.out.println();
        
        if (a | b) System.out.println("a or b = true");
        if (a | c) System.out.println("a or c = true");
        if (a | d) System.out.println("a or d = true");
        if (c | d) System.out.println("C or D = true");
        System.out.println();
        
        if (a ^ b) System.out.println("a or b but not both = true");
        if (a ^ c) System.out.println("a or c but not both  = true");
        if (a ^ d) System.out.println("a or d but not both  = true");
        if (c ^ d) System.out.println("C or D but not both  = true");
        
        System.out.println();
        
        if (!a) System.out.println("a not true");
        if (!b) System.out.println("b not true");
        if (!c) System.out.println("c not true");
        if (!d) System.out.println("d not true");
        System.out.println();

        if (a==b) System.out.println("a is the same value as b");
        if (b==c) System.out.println("b is the same value as c");
        if (c==d) System.out.println("c is the same value as d");
        if (a==d) System.out.println("d is the same value as a");
        }


        
}
