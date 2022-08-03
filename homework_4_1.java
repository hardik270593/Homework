package Homework;

public class homework_4_1 {

    static void a(){
        int x= 1;
        System.out.println("*---Month name----* ");
        switch (x){
            case 1: {
                System.out.println("January");
                break;
            }
            case 2: {
                System.out.println("February");
                break;
            }
            case 3: {
                System.out.println("March");
                break;
            }
            case 4: {
                System.out.println("April");
                break;
            }
            case 5: {
                System.out.println("May");
                break;
            }
            case 6: {
                System.out.println("Jun");
                break;
            }
            case 7: {
                System.out.println("July");
                break;
            }
            case 8: {
                System.out.println("August");
                break;
            }
            case 9: {
                System.out.println("September");
                break;
            }
            case 10: {
                System.out.println("October");
                break;
            }
            case 11: {
                System.out.println("November");
                break;
            }
            case 12: {
                System.out.println("December");
                break;
            }


        }
    }

    static void b() {
        //Write a program to print 10 even numbers and 10 odd numbers with for loop.
        System.out.println("*----Even or Odd number ----* ");
        int a = 1;

        for (a = 1; a <= 20; a++) {

            int b = a;
            b = b % 2;
            if (b == 0) {
                System.out.println(a+" is even number");
            } else {
                System.out.println(a+ " is odd number");

            }

        }

    }

    static void c() {
        //Write a program to generate tables of 10 wit for loop.
        System.out.println("*---table-----*");
        int j = 10;
        int i = 1;
        System.out.println("table of 10");
        for (i = 1; i <= 10; i++) {
            System.out.println(j + " * " + i + " = " + i * j);
        }
    }

    static void d() {
        // Write a program to print 10 even numbers and 10 odd numbers with while
        System.out.println("*----Even or Odd number ----* ");
        int a = 1;
        while (a <= 20) {
            int b = a;
            b = b % 2;
            if (b == 0) {
                System.out.println(a + " is even number");
            } else {
                System.out.println(a + " is odd number ");
            }
            a++;
        }
    }
    static void e(){
        //Write a program to generate tables of 9 with while .
        System.out.println("*---table-----*");
        int i =9 ;
        int j =1;
        while (j <= 10) {
            System.out.println(i + " * " + j + " = " + i * j);
            j++;
        }
    }
    static void f(){
        //Write a program to print 10 even numbers and 10 odd numbers with do while loop.
        System.out.println("*----Even or Odd number ----* ");
        int a=1;
        do{
            int b = a;
            b = b % 2;
            if (b == 0) {
                System.out.println(a + " is even number");
            } else {
                System.out.println(a + " is odd number ");
            }
            a++;
        } while(a<=20);
    }
    static void g(){
        //Write a program to generate tables of 9 with do while loop.
        System.out.println("*---table-----*");
        int i =9 ;
        int j =1;
        do{
            System.out.println(i + " * " + j + " = " + i * j);
            j++;
        } while(j<=10);
    }


    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
        f();
        g();


    }
}
