package com.company.solutions;

public class N342_PowerOf4 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public boolean isPowerOfFour(int n) {
        if (!isPowerOfTwo(n)) {
            return false;
        }
        return (n & 0x55555555) != 0;
    }
}
