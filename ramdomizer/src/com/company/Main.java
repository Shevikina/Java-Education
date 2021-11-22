package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int number=0;
        System.out.println("Сколько всего билетов?");
        number=read.nextInt();
        if(number<=0)
            return;
        else {
            int[] tiket= new int[number];
            for(int i=0; i<number; i++){
               int temporary=(int)(Math.random()*number+1);
               for(int j=i;j>=0;j--) {
                   if (temporary == tiket[j]) {
                       i--;
                       break;
                   }
                   else tiket[i]=temporary;
               }
            }
            System.out.println("В таком случае вот твои билеты:");
            for(int i:tiket) {
                System.out.print(i + " ");

            }
            }
        }
    }
