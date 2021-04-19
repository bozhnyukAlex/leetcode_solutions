package com.company.solutions;

import com.company.Main;

public class N69_SqrtX {
    public int mySqrt(int x) {
        double left = 0, right = 47000, mid;
        double eps = 0.00000001;
        while (Math.abs(left - right) > eps) {
            mid = (left + right) / 2;
            if (mid * mid < x) {
                left = mid;
            }
            else {
                right = mid;
            }
        }
        return (int) Math.floor(right);
    }
}
