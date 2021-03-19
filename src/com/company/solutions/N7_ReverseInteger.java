package com.company.solutions;

// 7. Reverse Integer
public class N7_ReverseInteger {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            if (res * 10 + x % 10 >= Integer.MAX_VALUE || res * 10 + x % 10 <= Integer.MIN_VALUE) {
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int) res;
    }
}
