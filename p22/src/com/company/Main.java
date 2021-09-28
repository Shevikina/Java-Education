/* написать программу, которая:
1) Считывает с консоли целое число N.
2)Если считанное число N больше 0,
 то программа дальше считывает целые числа,
  количество которых равно N.
3)Вывести в консоль считанные числа,
 если N нечетное — в порядке ввода,
 иначе — в обратном порядке.
Каждое число выводить с новой строки.
Число N выводить не нужно.*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] array = new int[N];
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                if (s.hasNextInt())
                    array[i] = s.nextInt();
            }
            if (N % 2 != 0) {
                for (int i = 0; i < N; i++)
                    System.out.println(array[i]);
            } else {
                for (int i = N - 1; i >= 0; i--)
                    System.out.println(array[i]);
            }
        }
    }
}
