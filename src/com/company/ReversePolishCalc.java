package com.company;

/**
 * Created by franciswalsh on 7/20/17.
 */

public class ReversePolishCalc {

    // You'll need a variable here to keep track of the top of the stack
    private int topOfStack = 0;

    // The array of the input string split up
    private String[] tokens;

    // The stack
    private String[] stack;

    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");

        // 2. Allocate a stack as big as the number of tokens
        stack = new String[tokens.length];

        // 3. write the algorithm
        for(int i = 0; i < tokens.length; ++i) {
            // calls to push() and pop() and do the math here
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/") ){
                push(tokens[i]);
            }
            else if (tokens[i].equals("*")){
                push(pop() * Double.parseDouble(stack[topOfStack-1]));
                if (topOfStack >= 3){
                    stack[topOfStack-2] = stack[topOfStack-3];
                    stack[topOfStack-3] = "0";
                }
            }
            else if (tokens[i].equals("/")){
                push(pop() / Double.parseDouble(stack[topOfStack-1]));
                if (topOfStack >= 3){
                    stack[topOfStack-2] = stack[topOfStack-3];
                    stack[topOfStack-3] = "0";
                }
            }
            else if (tokens[i].equals("+")){
                push(pop() + Double.parseDouble(stack[topOfStack-1]));
                if (topOfStack >= 3){
                    stack[topOfStack-2] = stack[topOfStack-3];
                    stack[topOfStack-3] = "0";
                }
            }
            else if (tokens[i].equals("-")){
                push((-1)*(pop()) + Double.parseDouble(stack[topOfStack-1]));
                if (topOfStack >= 3){
                    stack[topOfStack-2] = stack[topOfStack-3];
                    stack[topOfStack-3] = "0";
                }
            }


        }

        // 4. return the result
        return pop();
    }

    private void push(String number) {
        // push on the stack
        stack[topOfStack] = number;
        topOfStack += 1;
    }

    private void push(double d) {
        // change the double to a string and then push it on the stack
        stack[topOfStack] = Double.toString(d);
        topOfStack += 1;

    }

    private double pop() {
        // remove the string from the top of the stack and convert it to a double and return it
        topOfStack -= 1 ;
        return Double.parseDouble(stack[topOfStack]);
    }
}
