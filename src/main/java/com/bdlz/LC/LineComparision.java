package com.bdlz.LC;

import java.util.Objects;
import java.util.Scanner;

public class LineComparision {
    static void compareTo(Double value1, Double value2){
        if (value1 > value2) {
            System.out.println("Line1 is greater than line2");
        } else if (value1 < value2) {
            System.out.println("Line2 is greater than line1");
        } else {
            System.out.println("Both Lines are Equal");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x1 co-ordinate of first line: ");
        int x1 = s.nextInt();
        System.out.println("Enter y1 co-ordinate of first line: ");
        int y1 = s.nextInt();
        System.out.println("Enter x2 co-ordinate of first line: ");
        int x2 = s.nextInt();
        System.out.println("Enter y2 co-ordinate of first line: ");
        int y2 = s.nextInt();
        double value1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("length of Line1: " + value1);

        System.out.println("Enter p1 co-ordinate of second line: ");
        int p1 = s.nextInt();
        System.out.println("Enter q1 co-ordinate of second line: ");
        int q1 = s.nextInt();
        System.out.println("Enter p2 co-ordinate of second line: ");
        int p2 = s.nextInt();
        System.out.println("Enter q2 co-ordinate of second line: ");
        int q2 = s.nextInt();
        double value2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
        System.out.println("length of Line2: " + value2);

        compareTo(value1, value2);


    }
}
