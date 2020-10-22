package sk.kosickaakademia.onofrej.twodarray;

public class Table {
        private int[][] arr = new int[][]{ {2,5,8,0},{0,1,7,9},{-9,1,8,14}};

    public static void main(String[] args) {
        Table t = new Table();
        int value = t.min();
        System.out.println("Min value is "+value);
    }

    public int min (){
        int minimum=arr[0][0];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                /*if(arr[i][j]<minimum)
                    minimum=arr[i][j];*/
                minimum=arr[i][j]<minimum?arr[i][j]:minimum;
            }
        }
        return minimum;
    }

    public int max (){}

    public double avg (){}

    public int sumUnderDiagonale(){ // row>col

    }
}
