/*Программа считывает с клавиатуры 2 числа и выводит на экран большее из них.
Если числа одинаковые, то выводится любое.
Написать 2 версии: через условный оператор и через тернарный оператор
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите 2 числа");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(), b=s.nextInt();
        System.out.print("В случае условного оператора наиб. число: ");
        if(a>b) System.out.println(a);
        else if(a==b) System.out.println(a);
        else System.out.println(b);
        System.out.print("В случае тернарного оператора наиб. число: ");
        int max=a>b?a:b;
        System.out.println(max);
    }
}
