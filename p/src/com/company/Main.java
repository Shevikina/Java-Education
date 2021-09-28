/*Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings,
заменив их на null (null должны быть не строками "null").*/
package com.company;

import java.util.Scanner;

public class Main {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++)
            strings[i] = s.nextLine();
        int n;
        String str;
        for (int i = 0; i < 6; i++) {
            n = 0;
            if(strings[i]!=null)
            str = strings[i];
            else continue;
            for (int j = 0; j < 6; j++) {
                if (str.equals(strings[j])) n++;
            }
            if (n >= 2) {
                for (int k = 0; k < 6; k++)
                    if (str.equals(strings[k]))
                        strings[k] = null;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
