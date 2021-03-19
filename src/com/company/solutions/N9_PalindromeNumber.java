package com.company.solutions;


/* 9. Palindrome Number
   Given an integer x, return true if x is palindrome integer.
*/
public class N9_PalindromeNumber {
    public boolean isPalindromeString(int x) {
        String sx = Integer.toString(x);
        return sx.equals(new StringBuilder(sx).reverse().toString());
    }
    public boolean isPalindromeTrueVersion(int x) {
        int reverted = 0;
        int temp = x;
        if (x < 0 || (x != 10 && x % 10 == 0)) {
            return false;
        }
        while (temp > 0) {
            reverted = reverted * 10 + temp % 10;
            temp /= 10;
        }
        return reverted == x;
    }
}
