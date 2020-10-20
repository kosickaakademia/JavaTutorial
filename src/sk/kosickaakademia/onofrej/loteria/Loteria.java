package sk.kosickaakademia.onofrej.loteria;

import java.util.Arrays;
import java.util.Scanner;

public class Loteria {
    private final int TIP_LENGTH = 5; // pocwet hadanych cisel
    private final int ZREB_LENGTH = 10; // pocet zrebovanych cisel
    private final int MAX_VALUE = 20; // rozsah tipovanych cisel , od 1 do MAX_VALUE
    private int[] tip =new int[TIP_LENGTH];
    private int[] zreb=new int[ZREB_LENGTH];


    public static void main(String[] args) {

        Loteria loteria = new Loteria();
        // 0 vklad
        // metoda nacita kladne cislo (desatinne), doporucenie : do while
        // 1 zadavanie
        loteria.inputNumbers();
        // 2 zrebovanie
        loteria.drawNumbers();
        // 3 overovanie
        int result = loteria.checkTip();
        //4 vyhra
        //metoda - zisti kolko cisel sme uhadli a vypise vyhru
        // doporucujem switch
        // 0 alebo 1 cislo: 0 eur
        // 2 - 2 nasobok vkladu
        // 3 - 15 nasobok vkladu
        // 4 cisla 500 nasobok vkladu
        // 5 cisel 10000 nasobok vkladu
    }

    private int checkTip() {
        int count = 0;
        int i,j;
        for(i=0;i<TIP_LENGTH;i++){
            int value = tip[i];
            for(j=0;j<ZREB_LENGTH;j++){
                if(zreb[j]==value){  //zreb[j]==tip[i]
                    count++;
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Result: "+count);
        return count;
    }

    private void drawNumbers() {
        int i=0;
        int in;

        while(i<ZREB_LENGTH){

            in=(int)(Math.random()*MAX_VALUE+1);
            if(checkArrayZreb(i,in)) {
                zreb[i]=in;
                i++;
            }

        }
        Arrays.sort(zreb);
        System.out.println("Random numbers: ");
        for(i=0;i<ZREB_LENGTH;i++){
            System.out.print(zreb[i]+ " ");
        }
    }

    private boolean checkArrayZreb(int i, int in) {
        if(i==0)
            return true;
        for(int j=0;j<i;j++){
            if(zreb[j]==in)
                return false;
        }
        return true;
    }


    public void inputNumbers(){
        int i=0;
        int in;
        Scanner sc = new Scanner(System.in);
        while(i<TIP_LENGTH){
            System.out.print("Enter "+(i+1)+". number : ");
            in=sc.nextInt();
            if(in>0 && in <=MAX_VALUE && checkArray(i,in)) {
                tip[i]=in;
                i++;
            }
            else
                System.out.println("Wrong input! Try again.");
        }

        System.out.println("Your tips: ");
        for(i=0;i<TIP_LENGTH;i++){
            System.out.print(tip[i]+ " ");
        }
    }

    public boolean checkArray(int i, int in){
        if(i==0)
            return true;
        for(int j=0;j<i;j++){
            if(tip[j]==in)
                return false;
        }
        return true;
    }
}
