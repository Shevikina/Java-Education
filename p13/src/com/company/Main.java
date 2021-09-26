/*Напишем программу, в которой нужно вводить с клавиатуры
целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String entr="ENTER";
        boolean b=false;
        int k=0;
        while(!b)
        {

            if(!s.hasNextInt())
            {
                String word=s.nextLine();
                b=entr.equals(word);
            }
            else
                k+=s.nextInt();
        }
        System.out.println(k);
    }
}
