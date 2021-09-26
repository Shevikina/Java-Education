/*Ввести с клавиатуры температуру на улице.
Если температура меньше 0, вывести надпись "на улице холодно",
иначе - вывести надпись "на улице тепло".*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        if(t<0) System.out.println(cold);
        else System.out.println(warm);
    }
}
