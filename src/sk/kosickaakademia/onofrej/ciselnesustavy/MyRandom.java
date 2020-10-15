package sk.kosickaakademia.onofrej.ciselnesustavy;

import java.util.Scanner;

public class MyRandom {
    public static void main(String[] args) {
        MyRandom myRandom=new MyRandom();
        myRandom.guessNumber(310);
    }

    public void guessNumber(int max){  // 0,1451236 -> 14,51236
        System.out.println("Welcome! Guess number between 1 and "+max);
        int randomNumber=(int)(Math.random()*max +1);
        Scanner sc=new Scanner(System.in);
        int guess;
        do{
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if(guess==randomNumber)
                System.out.println("Super, you won!");
            else if(guess<randomNumber){
                System.out.println("Try a bigger number");
            }
            else
                System.out.println("Try a smaller number");
        }
        while(guess!=randomNumber);
    }

    public void nasobilka(int max){
        // 10 krat, a= 1- max, b=1-max
        // kolko je a*b
        // odpoved
        // odpove sa z  skontroluje
        // vysledok 8 z 10 correct, 80 %
        // DU ->GIT
    }
}
