/*1.Считывать целые числа с клавиатуры до тех пор,
 пока не будет введено что-то другое:
  например, строка или символ.
2.Должно быть введено минимум два числа.
Если введено меньше двух целых чисел,
то такую ситуацию обрабатывать не нужно,
а программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число
после минимального из введенных с клавиатуры.
Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько.*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int min=Integer.MAX_VALUE, n=0, min2=Integer.MAX_VALUE-1, num;
        while(s.hasNextInt())
        {
            num=s.nextInt();
            if(num<min)
            {
                min2=min;
                min=num;
            }
            else if(num<min2&&num!=min) min2=num;
            n++;
        }
        if(n>1) System.out.println(min2);
    }
}
