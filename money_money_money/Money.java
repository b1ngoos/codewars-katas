package com.b1ngoos.money_money_money;

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
