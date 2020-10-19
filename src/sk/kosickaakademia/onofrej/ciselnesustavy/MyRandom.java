package sk.kosickaakademia.onofrej.ciselnesustavy;

import java.util.Scanner;

public class MyRandom {
    public static void main(String[] args) {
        MyRandom myRandom=new MyRandom();
        //myRandom.guessNumber(310);
        //myRandom.vypis();
        System.out.println(myRandom.caesarsCipher("Dnes je PONDelok 19.10.2020 #!?+"));
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

    public int pocetOdrazov(double height, double koef){
        int count=0;
        while(height>=100){
            count++;
            height=height*koef;
        }
        return count;
    }

    public void fraction(){
        int c=80;
        int m=24;
        int i = 2;
        while(c>i && m>i){
            if(c%i==0 && m%i==0){
                c=c/i;
                m=m/i;
            }
            else
                i++;
        }
        System.out.println(c+" "+m);
    }

    public void triangle(){
        String text="Informatika";
        int len = text.length();
            int i,j;
            for(i=0;i<len;i++){
                for(j=i;j<len;j++) {
                    System.out.print(text.charAt(j));
                }
            System.out.println();
        }
    }
    public void triangle2(){
        String text="Informatika";
        int len = text.length();
        int i,j;
        for(i=0;i<len;i++){
            String myString = text.substring(i);
            System.out.println(myString);
        }
    }

    public void example91(){
        int x,y;
        for(x=0;x<=9;x++){
            for(y=0;y<=9;y++){
                int value=  807502 + x*10000 + y*10;
                if(value%91==0)
                    System.out.println(value);
            }
        }
    }

    public void sumOfFragments(){
        double p=0;
        int i;
        for(i=1;i<=100;i++){
            p=p+1.0/i;
        }
        System.out.println(p);
    }

    public void printAscii(){
        int i;
        for(i=65;i<=90;i++){
            System.out.println(i+" : " +(char)i + " ");
        }
        String r="kosice2021";
        char[] pole = r.toCharArray();
        int len = pole.length;
        for(i=0;i<len;i++)
            pole[i]=(char)(pole[i]+5);
        String newR=String.valueOf(pole);
        System.out.println(newR);
    }

    public String caesarsCipher(String text){
        int len = text.length();
        String sifra="";
        int i;
        for(i=0;i<len; i++){
            char z=text.charAt(i);
            if(z>='A' && z<='Z'){
                z=(char)(z+3);
                if(z>'Z')
                    z=(char)(z-26);
            }
            else if(z>='a' && z<='z'){
                z=(char)(z+3);
                if(z>'z')
                    z=(char)(z-26);
            }
            else if(z>='0' && z<='9'){
                z=(char)(z+3);
                if(z>'9')
                    z=(char)(z-10);
            }
            sifra=sifra+z;
        }
        return sifra;
    }

    public void textAnalyzer(String text){
        // vypise:
        // pocet malych pismen: 85
        // pocet velkych: 58
        // pocet cislic : 8
        // pocet medzier: 17
        // pocet viet: . ! ?
    }

}
