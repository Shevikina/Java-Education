/* реализуй метод main(String[]), который:
1) Считывает из консоли число N —
количество строк массива. Число должно быть больше 0.
2) Потом считывает N чисел из консоли (любые числа больше 0).
3) Затем инициализирует двумерный массив multiArray:
количеством строк N;
строки — массивами,
размер которых соответствует числам,
введенным в п.2 (в порядке ввода).*/
package com.company;
import java.util.Scanner;
public class Main {

    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        if(N>0){
            multiArray=new int[N][];
            int a,i=0;
            while(s.hasNextInt()&&i<N)
            {
                a=s.nextInt();
                if(a>0){
                    multiArray[i]=new int[a];
                    i++;
                }
            }
        }
    }
}
