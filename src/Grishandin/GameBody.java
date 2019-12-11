package Grishandin;

import java.util.Random;
import java.util.Scanner;

class GameBody {

    static Scanner scannerCon = new Scanner(System.in);

    static void gameBody(){
        Random randomVar = new Random();
        int count=0;
        int guess=-1;
        int number=randomVar.nextInt(10);
        while (count<3 & guess!=number){
        System.out.println("Guess the number from 0 to 9");
        guess=scannerCon.nextInt();
        if (number!=guess){
            System.out.println("Your number is"+ ((guess>number)? " less":" greater"));
            count++;
            }
        }
        System.out.println("You " + ((guess == number)? " win" : " lose, number is " + number));
        System.out.println("Repeat game? Yes - 1, No - 0");
    }
}

