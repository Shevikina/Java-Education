/*Используя цикл while вывести на экран сто раз цитату
(переменная quote):
«Я никогда не буду работать за копейки. Амиго»
Каждое значение вывести с новой строки.*/
package com.company;

public class Main {

    public static void main(String[] args) {
        int n=0;
        while(n<100)
        {
            String quote = "Я никогда не буду работать за копейки. Амиго";
            System.out.println(quote);
            n++;
        }
    }
}
