package sk.kosickaakademia.onofrej.gamw.guestcity;

import java.util.Random;

public class City {
    public String getRandomCity() {
        int[][] arr = new int[3][5];


        String[] array = new String[]{"Zvolen", "Bratislava", "Presov", "Poprad",
                "Michalovce"};
        Random rnd = new Random();
        int num = rnd.nextInt(array.length);
        return array[num];
    }
    public void play(){
        String city=getRandomCity().toUpperCase();
        String tip="";

        if(city.compareToIgnoreCase(tip)==0);

    }
}
