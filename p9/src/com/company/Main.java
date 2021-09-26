/*Напишем программу, которая будет считывать с клавиатуры возраст.
Если возраст от 20 до 60 (включительно),
то выводить ничего не нужно,
иначе - вывести фразу "можно не работать".
Сделать это можно (и нужно!)
с помощью только одного оператора if без else.*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<20||a>60)
            System.out.println("можно не работать");
    }
}
