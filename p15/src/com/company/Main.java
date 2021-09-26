/*Используя вложенные циклы while (цикл в цикле)
выведи на экран незаполненный прямоугольник (его контур)
размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.*/
package com.company;

public class Main {

    public static void main(String[] args) {
        int n=0, m=0;
        while(n<20)
        {
            System.out.print("Б");
            n++;
        }
        System.out.println();
        while(m<8)
        {
            System.out.print("Б");
            n=0;
            while(n<18)
            {
                System.out.print(" ");
                n++;
            }
            System.out.println("Б");
            m++;
        }
        n=0;
        while(n<20)
        {
            System.out.print("Б");
            n++;
        }
    }
}
