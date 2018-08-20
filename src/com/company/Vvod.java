package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vvod {
    Scanner scanner = new Scanner(System.in);

    public String znak() {
        String znak = scanner.nextLine();
        return znak;
    }

    public double num1() {
        double num1 = scanner.nextDouble();
        return num1;
    }

    public double num2() {
        double num2 = scanner.nextDouble();
        return num2;
    }
}
