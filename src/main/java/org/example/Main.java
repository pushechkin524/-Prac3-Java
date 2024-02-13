package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("__________________________________\n Добро пожаловать в программу!!!\n__________________________________");
        while (true) {
            System.out.print("Введите сторону прямоугольника a: ");
            int a = sc.nextInt();
            System.out.print("Введите сторону прямоугольника b: ");
            int b = sc.nextInt();
            System.out.print("Введите сторону прямоугольника c: ");
            int c = sc.nextInt();
            if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2))
                    || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(c, 2))) {
                System.out.println("Треугольник является прямоугольным.\n__________________________________");
            } else if ((a == b) && (a == c)) {
                System.out.println("Треугольник является равносторонним.\n__________________________________");
            } else if ((a==b) || (b==c) || (a==c)){
                System.out.println("Треугольник является равнобедренным.\n__________________________________");
            } else if (((a+b)<=c) || ((b+c)<=a) || ((c+a)<=b)) {
                System.out.println("Не является треугольником.\n__________________________________");
            } else System.out.println("Являются сторонами обчного треугольника\n__________________________________");
        }
    }
}


