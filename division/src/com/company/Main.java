package com.company;

public class Main {

    public static void main(String[] args) {
	int amount=0;
    int step=42;
    for(int i=10;i<100;i++)
        if(i%step==0&&(i%10!=(i%100)-i%10)&&i%10!=0) {
            System.out.println(i);
            amount++;
        }
    System.out.println("Всего чисел:"+ amount);
    }
}
