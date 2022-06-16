package com.codedifferently;

public class WuBuzz {
    /**
     * Write a short program that prints each number from 1 to n on a new line.
     *
     * For each multiple of 3, print "Wu" instead of the number.
     *
     * For each multiple of 5, print "Tang" instead of the number.
     *
     * For numbers which are multiples of both 3 and 5, print "WuTang Forever" instead of the number.
     * Example :
     * 1
     * 2
     * Wu
     * 4
     * Tang
     * Wu
     * 7
     * 8
     * Wu
     * Tang
     * 11
     * Wu
     * 13
     * 14
     * WuTangForever
     */

    public String wuTangClan(int n){
        String wu = "Wu";
        String tang = "Tang";
        String wuTangForever = "WuTang Forever";
        String output = "";
        for (int i = 1; i <= n; i++) {
            if (multipleOfThree(i) && multipleOfFive(i)) {
                output  += wuTangForever;
            } else if (multipleOfThree(i)) {
                output += wu;
            } else if (multipleOfFive(i)) {
                output += tang;
            } else {
                output += i;
            }
            output += "\n";
        }
        return output;
    }

    public boolean multipleOfThree(int n) {
        return (n % 3) == 0;
    }

    public boolean multipleOfFive(int n) {
        return (n % 5) == 0;
    }
}
