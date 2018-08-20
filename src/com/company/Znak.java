package com.company;
public class Znak {

    public static void operation(double num1, double num2, String znak){
        if (znak.equals("+"))
        {
            Sum sum = new Sum();
            System.out.println("Результа: " + sum.operation(num1, num2) + "\n");
        }
        else if (znak.equals("-"))
        {
            Sub sub = new Sub();
            System.out.println("Результа: " + sub.operation(num1, num2) + "\n");
        }
        else if (znak.equals("*"))
        {
            Multi multi = new Multi();
            System.out.println("Результа: " + multi.operation(num1, num2) + "\n");
        }
        else {
            Div div = new Div();
            System.out.println("Результа: " + div.operation(num1, num2) + "\n");
        }
    }
}
