package sk.kosickaakademia.onofrej.ciselnesustavy;

public class MyString {
    // AHOJ -> JOHA
    public String reverse(String text){
        char[] pole = text.toCharArray();
        int len = text.length();
        int len2=len/2;
        for(int i=0;i<len2;i++){
            char m=pole[len-1-i];
            pole[len-1-i]=pole[i];
            pole[i]=m;
        }
        String result= String.valueOf(pole);
        return result;
    }
}
