/*используя цикл for, вывести на экран
прямоугольный треугольник из восьмёрок
со сторонами (катетами) 10 и 10.*/
package com.company;

public class Main {

    public static void main(String[] args) {
        int n=1;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<n&&n<=10;j++)
            {
                System.out.print("8");
            }
            System.out.println();
            n++;
        }

    }
}
