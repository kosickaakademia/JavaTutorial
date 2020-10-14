package sk.kosickaakademia.onofrej.ciselnesustavy;

public class Convert {
    public String convertDecimalToBinary(int value) {
        if (value <= 0)
            return "0";

        String result = "";
        while (value > 0) {
            result = (value % 2) + result;
            value = value / 2;

        }
        return result;
    }

    public int convertBinaryToDecimal(int value) {
        if (value <= 0)
            return 0;
        int i = 0;
        int result = 0;
        while (value > 0) {
            int last = value % 10;
            result = result + last * (int) Math.pow(2, i);
            value = value / 10;
            i++;
            ;
        }
        return result;
    }

    public String convertDecimalToOctal(int value) {
        if (value <= 0)
            return "0";

        String result = "";
        while (value > 0) {
            result = (value % 8) + result;
            value = value / 8;

        }
        return result;
    }

    public String convertDecimalToHexadecimal(int value) {
        int temp;
        if (value <= 0)
            return "0";

        String result = "";
        while (value > 0) {
            temp = (value % 16);  // rest 0-15
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
            switch (temp) {
                case 10:
                    result = "A" + result;
                    break;
                case 11:
                    result = "B" + result;
                    break;
                case 12:
                    result = "C" + result;
                    break;
                case 13:
                    result = "D" + result;
                    break;
                case 14:
                    result = "E" + result;
                    break;
                case 15:
                    result = "F" + result;
                    break;
                default:
                    result = temp + result;
            }


            value = value / 16;

        }
        return result;
    }




    public int convertHexadecimalToDecimal(String data) {
        int len = data.length();
        int exp = 0;
        int result = 0;
        for (int i = len - 1; i >= 0; i--) {
            char z = data.charAt(i);
            switch (z) {
                case '0':
                    result = result + 0;
                    break;
                case '1':
                    result = result + (int) Math.pow(16, exp);
                    break;
                case '2':
                    result = result + 2 * (int) Math.pow(16, exp);
                    break;
                case '3':
                    result = result + 3 * (int) Math.pow(16, exp);
                    break;
                case '4':
                    result = result + 4 * (int) Math.pow(16, exp);
                    break;
                case '5':
                    result = result + 5 * (int) Math.pow(16, exp);
                    break;
                case '6':
                    result = result + 6 * (int) Math.pow(16, exp);
                    break;
                case '7':
                    result = result + 7 * (int) Math.pow(16, exp);
                    break;
                case '8':
                    result = result + 8 * (int) Math.pow(16, exp);
                    break;
                case '9':
                    result = result + 9 * (int) Math.pow(16, exp);
                    break;
                case 'A':
                    result = result + 10 * (int) Math.pow(16, exp);
                    break;
                case 'B':
                    result = result + 11 * (int) Math.pow(16, exp);
                    break;
                case 'C':
                    result = result + 12 * (int) Math.pow(16, exp);
                    break;
                case 'D':
                    result = result + 13 * (int) Math.pow(16, exp);
                    break;
                case 'E':
                    result = result + 14 * (int) Math.pow(16, exp);
                    break;
                case 'F':
                    result = result + 15 * (int) Math.pow(16, exp);
                    break;
            }
            exp++;
        }
        return result;
    }
}
