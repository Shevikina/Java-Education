/*Вывести на экран сумму чисел от 1 до 100 включительно,
 не кратных 3. Для этого используй цикл while.*/
package com.company;

public class Main {

    public static void main(String[] args) {
        int n=0,k=0;
        while(n<=100)
        {
            if(n%3==0)
            {
                n++;
                continue;
            }
            else
                k+=n;
            n++;
        }
        System.out.println(k);
    }
}
