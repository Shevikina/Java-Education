/*Ввести с клавиатуры имя и возраст.
Если возраст в пределах 18-28 (включительно),
то вывести надпись "Имя, явитесь в военкомат",
где Имя - это имя, введенное ранее с клавиатуры.*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        int age=s.nextInt();
        if(age>=18&&age<=28)
            System.out.println(name+militaryCommissar);
    }
}
