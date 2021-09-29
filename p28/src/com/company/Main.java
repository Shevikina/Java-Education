/*Реализуй метод main(String[]),
который выводит массивы strings и ints
в консоли с помощью метода Arrays.toString().*/
package com.company;

import java.util.Arrays;

public class Main {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String a = Arrays.toString(strings), b = Arrays.toString(ints);
        System.out.println(a);
        System.out.println(b);
    }
}
