/*Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива
и вывести в консоль.*/
package com.company;
import java.util.Scanner;
public class Main {
    public static int[] array;
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        array=new int[N];
        for(int i=0;i<N;i++)
            array[i]=s.nextInt();
        int min=array[0];
        for(int j=0;j<N;j++)
        {
            if(array[j]<min) min=array[j];
        }
        System.out.println(min);
    }
}
