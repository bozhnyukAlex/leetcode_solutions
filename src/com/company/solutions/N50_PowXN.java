package com.company.solutions;

public class N50_PowXN {

    public double myPowHelper(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double temp = myPowHelper(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        }
        else {
            return  x * temp * temp;
        }
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            double res = myPowHelper(x, -n);
            return 1 / res;
        }
        else return myPowHelper(x, n);
    }
}
