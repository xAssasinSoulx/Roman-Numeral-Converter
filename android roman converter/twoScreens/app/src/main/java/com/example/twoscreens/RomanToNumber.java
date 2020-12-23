package com.example.twoscreens;

public class RomanToNumber {

    // We return the value of the roman symbol
    int value(char a){
        if (a == 'I')
            return 1;
        if (a == 'V')
            return 5;
        if (a == 'X')
            return 10;
        if (a == 'L')
            return 50;
        if (a == 'C')
            return 100;
        if (a == 'D')
            return 500;
        if (a == 'M')
            return 1000;
        return 0;
    }

    // Finds decimal value of a given roman numeral
    int romanToDecimal(String str){
        int res = 0;
        for (int i=0; i<str.length(); i++){
            // Getting value at s[i]
            int s1 = value(str.charAt(i));
            // Getting value at s[i+1]
            if (i+1 <str.length()){
                int s2 = value(str.charAt(i+1));
                // Comparing both values (s1 and s2)
                if (s1 >= s2){
                    // Value of s1 is greater or equalto the next symbol
                    res = res + s1;
                }
                else{
                    res = res + s2 - s1;
                    i++; // Value of current symbol is less than the next symbol
                }
            }
            else{
                res = res + s1;
                i++;
            }
        }
        return res;
    }
}
