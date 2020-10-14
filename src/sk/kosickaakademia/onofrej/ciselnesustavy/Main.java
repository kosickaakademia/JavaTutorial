package sk.kosickaakademia.onofrej.ciselnesustavy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value, cs;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive value: ");
            value=sc.nextInt();
        }while(value<0);

        do {
            System.out.print("Enter a base [2,8,16]: ");
            cs=sc.nextInt();
        }while(cs!=2 && cs != 8 && cs!=16);

        String result="";
        Convert convert=new Convert();
        switch(cs){
            case 2: result = convert.convertDecimalToBinary(value);
            break;
            case 8: result = convert.convertDecimalToOctal(value);
            break;
            case 16: result = convert.convertDecimalToHexadecimal(value);

        }
        System.out.println("Result: "+result);

        MyString ms=new MyString();
        String reverse = ms.reverse("VENtiLAtoR");
        System.out.println(reverse);

        int v=convert.convertHexadecimalToDecimal("A5E8");
        System.out.println(v);

        String data =" Procedural programming is about writing procedures or methods that perform" +
                " operations on the data, while object-oriented programming is about crEating objects" +
                " that contain both data and methods. " ;
        System.out.println(ms.getCountOfVowels(data));
    }


}
