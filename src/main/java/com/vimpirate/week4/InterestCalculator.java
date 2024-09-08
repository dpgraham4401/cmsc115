package com.vimpirate.week4;

/**
 * Select a method from the Math class in Java and describe how you could use that method to
 * perform a calculation in a real-world application setting.
 *
 * @Author: David Graham
 * CMSC 115 - Week 4 Discussion
 */
public class InterestCalculator {

    private final int MONTHS_IN_YEAR = 12;
    private final double principal;
    private final double annualRate;
    private final int years;
    private final double monthlyContribution;

    public InterestCalculator(double principal, double rate, int years, double monthlyContribution) {
        this.principal = principal;
        this.annualRate = rate;
        this.years = years;
        this.monthlyContribution = monthlyContribution;
    }

    public static void main(String[] args) {
        InterestCalculator calculator = new InterestCalculator(1000, 0.05, 5, 100);
        System.out.printf("Future value: $%.2f\n", calculator.CalculateFutureValue());
    }

    /**
     * Calculate the future value of an investment with monthly contributions.
     * <p>
     * <a href="https://www.nerdwallet.com/calculator/compound-interest-calculator">NerdWallet Compound interest calculator</a>
     * <p>
     * To calculate interest without a calculator, use the formula A=P(1+r/n)^nt, where:
     * A = ending amount.
     * P = original balance.
     * r = interest rate (as a decimal).
     * n = number of times interest is compounded in a specific time frame.
     * t = time frame.
     */
    public double CalculateFutureValue() {
        int n = getCompoundFrequency();
        // convert annual rate to monthly rate -- we only support month intervals
        double r = annualRate / n;
        // calculate future value of the principal
        double futureValue = principal * Math.pow(1 + r, years * n);
        // add future value of monthly contributions
        futureValue += monthlyContribution * (Math.pow(1 + r, years * n) - 1) / r;
        return futureValue;
    }

    private int getCompoundFrequency() {
        return MONTHS_IN_YEAR;
    }
}
