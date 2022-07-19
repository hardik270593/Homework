package Homework;

public class homework_1 {
    public static void main(String[] args) {
        System.out.println("\n * LOGICAL OPERATORS *");
        int F = 30;
        int G = 90;
        System.out.println(F>G && F<G);
        System.out.println(G<F || F>G);
        System.out.println (!(F>G || F<G));

        System.out.println("\n *  Assignment Operator*");
        int a = 15;
        int b = 55;
        System.out.println(a+= b);// a1 = a+b  this function show this sentence structure.
        System.out.println("a1 ="+a);
        System.out.println(a-= b);// a2 = a-b this function show this sentence structure.
        System.out.println("a2 ="+a);
        System.out.println(a*=b); // a3 = a*b this function show this sentence structure.
        System.out.println("a3 ="+a);
        System.out.println(a/= b); // a4 = a/b this function show this sentence structure.
        System.out.println("a4 ="+a);
        System.out.println(a%= b); // a5 = a % b this function show this sentence structure.
        System.out.println("a5 ="+a);
        // for example , you can try this way
        //System.out.println( a^=b);
        System.out.println(a = a^b); //a6 = a^b  this function show this sentence structure.
        System.out.println("a6 ="+a);

        System.out.println("\n *   UNARY OPERATOR   *");
        int q = 10;
        boolean z = true;

        System.out.println(q++);
        System.out.println(++q);
        System.out.println(q--);
        System.out.println(--q);
        System.out.println(!(!(!z)));
        // we can add after unary
        System.out.println(--q+a);

        System.out.println("\n *  RELATIONAL OPERATORS    *");
        int h = 30;
        int j = 30;
        System.out.println(h==j);;
        System.out.println(h!=j);
        System.out.println(h<j);
        System.out.println(h>j);
        System.out.println(h<=j);
        System.out.println(h>=j);

    }
}


