package com.company;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Я четенький калькулятор, умею считать!");

        while(true){
            try {
                Vvod vvod = new Vvod();
                System.out.println("Выберите действие: \n\"*\" - умножить" +
                        "\n\"/\"  - делить\n\"-\" - вычесть\n\"+\" - сложить\n\"666\" - чтобы я пошел отдыхать");

                String znak = vvod.znak();
                if (znak.equals("666")) {
                    System.out.println("Я еще вернусь!");break;
                }
                if (!znak.equals("*") && !znak.equals("/") && !znak.equals("+") && !znak.equals("-")) {
                    System.out.println("Могу считывать только это(((((");
                    continue;
                }

                System.out.println("Введите первое число:");
                double num1 = vvod.num1();

                System.out.println("Введите второе число:");
                double num2 = vvod.num2();
                Znak.operation(num1, num2,znak);

            } catch (InputMismatchException c) {
                System.out.println("Чет не то ты ввел, попробуй еще разок.");
                continue;
            }
            catch (ArithmeticException e){
                System.out.println("Чет не то ты ввел, попробуй еще разок.");
                continue;
            }
        }
    }
}
