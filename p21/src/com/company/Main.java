/*Реализовать метод main(String[]),
в котором нужно скопировать содержимое массивов
firstArray и secondArray в один массив resultArray.
Массив firstArray должен быть
в начале нового массива resultArray,
а secondArray — после него.*/
package com.company;

public class Main {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++)
            resultArray[i] = firstArray[i];
        for (int i = firstArray.length, j = 0; j < secondArray.length; j++, i++)
            resultArray[i] = secondArray[j];
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
