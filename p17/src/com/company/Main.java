/*Программа должна считывать целые числа с клавиатуры до тех пор,
 пока не будет введено что-то другое:
 например, строка или символ.
 Выведи на экран минимальное число из введенных.
 Если введено несколько таких чисел,
 необходимо вывести любое из них.*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=Integer.MAX_VALUE, b;
        while(s.hasNextInt())
        {
            b=s.nextInt();
            if(b<a) a=b;
        }
        System.out.println(a);
    }
}
