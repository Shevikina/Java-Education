/*Напиши программу, которая считывает с клавиатуры две строки
и выдает сообщение о том, одинаковые ли эти строки.*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a=s.nextLine(), b=s.nextLine();
        if(a.equals(b))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}
