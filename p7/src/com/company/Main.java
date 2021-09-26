/*Ввести с клавиатуры три целых числа.
Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(), b=s.nextInt(), c=s.nextInt();
        if(a==b && b==c)
            System.out.println(a+" "+b+" "+c);
        else if(a==b)
            System.out.println(a+" "+b);
        else if(a==c)
            System.out.println(a+" "+c);
        else if(b==c)
            System.out.println(b+" "+c);
    }
}
