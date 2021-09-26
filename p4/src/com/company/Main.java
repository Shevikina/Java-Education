/*Задача на сравнение строк.
* Через несколько различных символов есть закодированное слово.
* Считать с консоли слово и сравнить, совпадает ли оно с шифром*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите пароль");
        String a="ИнК",b="СУ", c="ап",d="цИ", e="Ля", f="я";
        Scanner s=new Scanner(System.in);
        String codeword=s.nextLine();
        if(codeword.equalsIgnoreCase(a+c+b+e+d+f))
            System.out.println("Пароль почти верен. Мы не знаем стоит ли вас пропускать.");
        else if(codeword.equals(a+c+b+e+d+f))
            System.out.println("Пароль верен");
        else
            System.out.println("Неверный пароль");
    }
}
