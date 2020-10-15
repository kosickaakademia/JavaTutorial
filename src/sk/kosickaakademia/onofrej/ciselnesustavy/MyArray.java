package sk.kosickaakademia.onofrej.ciselnesustavy;

public class MyArray {

    public static void main(String[] args) {
        int[] a= {15,7,12,98,14,25,38,74,152,87,65,0,12,54,98,1};
        MyArray myArray=new MyArray();
        int[] b= myArray.selectPairValues(a);
        int lenB=b.length;
        for(int j=0;j<lenB;j++)
            System.out.print(b[j]+" ");
    }

    public int[] selectPairValues(int[] a){
        int lenA=a.length;
        int countPair=0;
        int i,j;
        for(i=0;i<lenA;i++){
            if(a[i]%2==0)
                countPair++;
        }
        j=0;
        int[] b = new int[countPair];
        for(i=0;i<lenA;i++){
            if(a[i]%2==0)
                b[j++]=a[i];

        }
        return b;
    }
}
