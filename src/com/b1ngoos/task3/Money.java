package com.b1ngoos.task3;

public class Money {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {

        int year = 0;

        while (principal < desired) {

            double interestAmount = principal * interest;
            principal = principal + interestAmount - (interestAmount * tax);
            year ++;
        }

        return year;
    }
}
