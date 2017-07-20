package com.company;

/**
 * Test Driven Development (TDD)
 * Write your tests first and watch them fail.
 * Then write the algorithm and watch the tests pass.
 */
public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();


        String rpnExpression = "4,5,/";
        double expectedResult = .8;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        // Write tests for the other operators (-, *, /)

//         Uncomment this test which has many operators
         rpnExpression = "4,2,5,*,+,1,3,2,*,+,/";
         expectedResult = 2;
         actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        int[] testArray = {6, 4, 3, 8, 7, 0, 100, 2};
        BubbleSort bc = new BubbleSort();

        for (int num : bc.bubSorting(testArray)){
            System.out.println(num);
        }

    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
