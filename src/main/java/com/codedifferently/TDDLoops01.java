package com.codedifferently;

public class TDDLoops01 {
    public String oneToTen(){
        String output ="oneToTen()\n"
                +"*** Output ***";
        for(int x=1; x<=10; x++){
            output += "\n"+x;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n"
                +"*** Output ***";
        for(int x =1; x < 20 ; x+=2){
            output += "\n"+x;
        }

        return output;
    }

    // output the numbers 1 - 25 squared in the same format as before
    public String squares(){
        String output = "squares()\n"
                +"*** Output ***";
        for (int i = 1; i <= 5; i++) {
            int iSquared = i * i;
            output += "\n" + iSquared;
        }
        return output;
    }

    // take in the value of n and decide if it is even
    public String even(int n){
        String nIsEven = "n is even";
        String nIsNotEven = "n is not even";
        if ((n % 2) == 0) {
            return nIsEven;
        }
        return nIsNotEven;
    }

    // output the numbers 1 - 100 to the power of n
    public String powers(int n){
        String output = "powers()\n"
                +"*** Output ***";
        for (int i = 1; i <= 10; i++) {
            int iToPowerOfN = (int) Math.pow(i, n);
            output += "\n" + iToPowerOfN;
        }
        return output;
    }

}