package com.example.twoscreens;

public class NumberToRoman {
    String intToRoman(int num) {
//We store the roman values according to the their places, thousands, hundreds, tens and ones.
        String m[] = {"", "M", "MM", "MMM"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D",
                "DC", "DCC", "DCCC", "CM"};
        String x[] = {"", "X", "XX", "XXX", "XL", "L",
                "LX", "LXX", "LXXX", "XC"};
        String i[] = {"", "I", "II", "III", "IV", "V",
                "VI", "VII", "VIII", "IX"};

        // we convert the given integer by diving it into parts
        String thousands = m[num/1000]; //we find the thousands and we assign the result to the array given above
        String hundereds = c[(num%1000)/100]; //we find the hundreds and we assign the result to the array given above
        String tens = x[(num%100)/10]; //we find the tens and we give the roman symbol according to the result by using the array provided above
        String ones = i[num%10]; //the same process

        String ans = thousands + hundereds + tens + ones; //we print the result
        return ans;
    }
}
