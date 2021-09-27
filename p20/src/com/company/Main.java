/*В методе main() есть переменная double glass = 0.5,
 которая символизирует наполовину заполненный стакан.
 Для пессимиста он наполовину пуст,
 а для оптимиста - наполовину полон.
Необходимо считать с клавиатуры данные типа boolean,
используя метод nextBoolean() объекта типа Scanner.
В зависимости от полученных данных, округлить переменную glass:
до целого числа вниз (0), если пессимист (false)
и до целого числа вверх (1), если оптимист (true).
Результат вывести на экран.*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double glass = 0.5;
        Scanner s=new Scanner(System.in);
        boolean b=s.nextBoolean();
        if(b) glass=Math.ceil(glass);
        else glass=Math.floor(glass);
        System.out.println((int)glass);
    }
}
