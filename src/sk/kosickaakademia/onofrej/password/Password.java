package sk.kosickaakademia.onofrej.password;

import java.util.Random;

public class Password {

    public String randomCapitalPassword(){
        // vrati nahodne heslo 8 znakov velke pismena
        String pass="";
        Random rnd=new Random();
        int i=0;
        while(i<8){  // for(i = 0;i<8;i++)
            char z = (char)(rnd.nextInt(26)+65);
            pass+=z;
            i++;
        }

        return pass;
    }

    public String randomCapitalPassword(int length){
        // vrati nahodne heslo 8 znakov velke pismena
        String pass="";
        Random rnd=new Random();
        int i=0;
        while(i<length){  // for(i = 0;i<8;i++)
            char z = (char)(rnd.nextInt(26)+65);
            pass+=z;
            i++;
        }

        return pass;
    }

    public String randomPassword(){
        // male pismena, velke pismena a cislice
        // A15dfRw8aS
        // 9fgT7R5hzW
        return null;
    }

}
