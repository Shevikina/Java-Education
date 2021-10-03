/*1)Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
2)Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
В методе min(int[]) обязательно используй метод Math.min(int, int).*/
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int m=ints[0];
        for(int i=1;i<10;i++)
            m=Math.min(m,ints[i]);
        return m;
    }

    public static int[] getArrayOfTenElements() {
        Scanner s=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++)
            a[i]=s.nextInt();
        return a;
    }
}
