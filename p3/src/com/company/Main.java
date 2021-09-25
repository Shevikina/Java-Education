/* Программма считывает с клавиатуры 2 вещественных числа
 и выдает сообщение о том, равны ли они с точностью до одной миллионной*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Напишите 2 вещественных числа с точностью до миллионных");
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble(), b=s.nextDouble();
        if(Math.abs(b-a)<0.00001)
            System.out.println("Числа равны");
        else
            System.out.println("Числа не равны");
    }
}
