package sk.kosickaakademia.onofrej.twodarray;

import java.util.Random;

public class Table {
        private int[][] arr = new int[][]{ {2,5,8,0},{0,1,7,9},{-9,1,8,14}};
        private static int[][] poleXX = new int[][]{ {2,5,8,0},{0,1,7,9},{-9,1,8,14}};

        public static void main(String[] args) {

        Table t = new Table();
        int value = t.min();
        System.out.println("Min value is "+value);

        int[][] result = Table.transponovana(poleXX);
        t.print(result);
    }

    public int min (){
        int minimum=arr[0][0];
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++){
                /*if(arr[i][j]<minimum)
                    minimum=arr[i][j];*/
                minimum=arr[i][j]<minimum?arr[i][j]:minimum;
            }
        }
        return minimum;
    }

    /*public int max (){}

    public double avg (){}

    public int sumUnderDiagonale(){ // row>col

    }*/

    public static int[][] transponovana(int[][] p){
        int row=p.length;
        int col=p[0].length;
        int[][] r=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                r[j][i]=p[i][j];
            }
        }

        return r;
    }

    public void print(int[][] p){
        int row=p.length;
        int col=p[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(p[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void changeArray(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        int i, j;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(arr[i][j]<0){
                    arr[i][j] = absolutValue(arr[i][j]);
                }
                else if(arr[i][j]>0 && arr[i][j]%2==1){
                    arr[i][j] = roundToPair(arr[i][j]);
                }
                else if(arr[i][j]==0){
                    arr[i][j] = randomNum();
                }
            }
        }
    }

    private static int randomNum() {
        Random rnd = new Random();
        return rnd.nextInt(90)+10; // 0-89 -> 10-99
    }

    private static int roundToPair(int value) {
        int last=value%10;
        if(last<4)
            return value-1;
        else
            return value +1;
    }

    private static int absolutValue(int value) {
        return value>=0? value:-value;
    }

}
