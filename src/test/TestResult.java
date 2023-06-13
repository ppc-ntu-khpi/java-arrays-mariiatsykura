package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        int n = 10;
        System.out.println("Number of ways to climb the ladder to the 10th step: " + Exercise.Calculate(n));
    }
}