package Homework;

import java.util.Scanner;

public class homework_3_1 {
    public static void main(String[] args) {
        Scanner H = new Scanner(System.in);

        System.out.println("*--- choose switch number ----*");
        System.out.println(" 1.check even or odd number \n 2.print table \n 3.check person can give vot or not \n 4. check positive or negative number \n 5.check positive , negative and zero number ");
        System.out.println("*------------------------------*");
        System.out.println(" choose  switch number :- ");

        int s = Integer.parseInt(H.nextLine());
        switch (s) {
            //check the even and odd number
            case 1: {
                System.out.println("enter number :-");
                int a = Integer.parseInt(H.nextLine());
                a = a % 2;
                if (a == 0) {
                    System.out.printf("this is even number");
                } else {
                    System.out.println("this is odd number");
                }
            }
            break;
            //table of which you need
            case 2: {
                System.out.println("enter table number :-");
                int j = Integer.parseInt(H.nextLine());
                int i = 1;
                System.out.println("table of 7");
                for (i = 1; i <= 10; i++) {
                    System.out.println(j + " * " + i + " = " + i * j);
                }
            }
            break;
            // voting age
            case 3: {
                System.out.println("enter the age  :-");
                int a = Integer.parseInt(H.nextLine());
                if (a >= 18) {
                    System.out.println("you can vote because you are " + a);
                } else {
                    System.out.println("you can't vote");
                }
            }
            break;
            // positive and negative
            case 4: {
                System.out.println("enter the number for check positive or negative  :-");
                int m = Integer.parseInt(H.nextLine());
                if (m > 0) {
                    System.out.println("this is positive ");
                } else {
                    System.out.println("this is negative ");
                }
            }
            break;
            // positive , negative and zero
            case 5: {
                System.out.println("enter number to check positive , negative or zero :-");
                int n = Integer.parseInt(H.nextLine());
                if (n > 0) {
                    System.out.println(n + " is positive ");
                } else if (n == 0) {
                    System.out.println(n + " is zero");
                } else {
                    System.out.println(n + " is negative number");
                }

            }
            break;
        }

        }
}
