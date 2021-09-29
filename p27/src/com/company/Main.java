/*В методе main(String[]) выведи на экран
все числа из трехмерного массива multiArray.*/
package com.company;

public class Main {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int[][] ints : multiArray) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
