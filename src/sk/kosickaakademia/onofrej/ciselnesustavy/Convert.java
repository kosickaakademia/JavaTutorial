package sk.kosickaakademia.onofrej.ciselnesustavy;

public class Convert {
    public String convertDecimalToBinary(int value){
        if(value<=0)
            return "0";

        String result="";
        while(value>0){
            result=(value%2)+result;
            value=value/2;

        }
        return result;
    }

    public String convertDecimalToOctal(int value){
        if(value<=0)
            return "0";

        String result="";
        while(value>0){
            result=(value%8)+result;
            value=value/8;

        }
        return result;
    }

    public String convertDecimalToHexadecimal(int value){
        int temp;
        if(value<=0)
            return "0";

        String result="";
        while(value>0){
            temp=(value%16);  // rest 0-15
           /* if(temp<=9)
                result = temp+result;
            else if(temp==10)
                result="A"+result;
            else if(temp==11)
                result="B"+result;
            else if(temp==12)
                result="C"+result;
            else if(temp==13)
                result="D"+result;
            else if(temp==14)
                result="E"+result;
            else if(temp==15)
                result="F"+result;*/
            switch(temp){
                case 10: result="A"+result; break;
                case 11: result="B"+result; break;
                case 12: result="C"+result; break;
                case 13: result="D"+result; break;
                case 14: result="E"+result; break;
                case 15: result="F"+result; break;
                default: result=temp+result;
            }


            value=value/16;

        }
        return result;
    }
}
