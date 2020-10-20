package sk.kosickaakademia.onofrej.loteria;

import java.util.Scanner;

public class Loteria {
    private int[] tip =new int[5];
    private int[] zreb=new int[10];

    public static void main(String[] args) {
        Loteria loteria = new Loteria();
        // 1 zadavanie
        loteria.inputNumbers();
        // 2 zrebovanie
        // 3 overovanie
    }

    public void inputNumbers(){
        int i=0;
        int in;
        Scanner sc = new Scanner(System.in);
        while(i<5){
            System.out.print("Enter "+(i+1)+". number : ");
            in=sc.nextInt();
            if(in>0 && in <21 && checkArray(i,in)) {
                tip[i]=in;
                i++;
            }
            else
                System.out.println("Wrong input! Try again.");
        }

        System.out.println("Your tips: ");
        for(i=0;i<5;i++){
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
