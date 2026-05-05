
#  Reverse Polish Notation

this project is to implement a ReversePolishNotation class designed to manipulate and calculate arithmetic expressions using stack-based algorithms. The class converts human-readable infix expressions (e.g., 5 + 3) to computer-efficient postfix notation (e.g., 5 3 +) and evaluates the resulting postfix expressions.

## Installation
   ### Step 1: Clone the repo
```
git clone https://github.com/EPIC-Campus-LPS/reverse-polish-notation-alexashtodd
cd reverse-polish-notation-alexashtodd
```
   

## How to Run the Code

Follow these steps to save, compile, and execute the Reverse Polish Notation calculator in Java.

### Step 1: Save the File
Create a new file and paste your code into it. Name it exactly:

`ReversePolishNotation.java`

### Step 2: Add a Main Method
Ensure your class includes a `main` method so it can actually run. Place this inside your class:

```java
public static void main(String[] args) {
    ReversePolishNotation calc = new ReversePolishNotation();
    // Example: "3 4 +" equals 7
    System.out.println("Result: " + calc.evaluate("3 4 +"));
}
```

### step 3: Compile and Execute
Open your terminal or command prompt and run these two commands:

```java
javac ReversePolishNotation.java
java ReversePolishNotation
```

## What the Output Looks Like

When you run the program, the console will show the "logic" of the stack in real-time.

### Part A: Infix to Postfix Conversion
The code checks the "weight" (precedence) of each operator.
```
   text
   The precedence is: 1
   The precedence is: 2
   The precedence is: 1
   The precedence is: 1
   ... (continues for each operator)
   Postfix Result: 7 2 9 / + 3 5 * +
```
### Part B: Evaluating the Postfix
   he evaluatePostfix method prints the state of the stack every time it changes. It looks like this:

```
                       text
   [7]              <-- 7 added
   [7, 2]           <-- 2 added
   [7, 2, 9]        <-- 9 added
   [7, 2, 9]        <-- Operator '/' found, popping 9 and 2
   [7, 0]           <-- 2/9 is 0, pushed back
   [7, 0]           <-- Operator '+' found, popping 0 and 7
   [7]              <-- 7+0 is 7, pushed back
   Final Calculation Result: 22
```
Note: integer division is used, so results are truncated

## Resources and Citations

### Core Concept
Infix: 5 + 3 (human-readable)\
Postfix (RPN): 5 3 + (stack-friendly)\
The algorithm uses a stack to:\
convert infix → postfix\
evaluate postfix expressions\


### Documentation / Technical References
#### for part A
Takes in an infix expression as a String, converts it to a postfix expression and returns it
1. read 2 numbers
2. put on stack
3. read operator
4. take 2 numbers
5. perform operation
6. put result on stack

#### for part B 
1. Initializes a Stack
2. Scans the Input String
3. Handles Operands Directly: If the current character is an operand (a number or variable like A, B, or 5), it is immediately appended to the result postfix string.
4. Manages Operator Precedence: When an operator (like +, -, *, /, or ^) is encountered, the algorithm compares its precedence against the operator at the top of the stack:
5. Processes Parentheses:
6. Opening Parentheses (: These are always pushed onto the stack to mark the beginning of a sub-expression.
7. Closing Parentheses ): These trigger the algorithm to pop all operators from the stack and append them to the result until a matching ( is reached.
8. Clears the Stack
9. Returns the Result

### Learning Resources
[DSA Stacks and Queues](https://docs.google.com/presentation/d/1cl16kJ1Mvsz6QlV_STgsCsIMzOhoYER4/edit?slide=id.p1#slide=id.p1)\
using this for the understanding of stacks and queues, this helps because it exsplans how to use them and how they work, withch helps with the requirement for Stacks and Queues\
[DSA What is Reverse Polish Notation](https://docs.google.com/presentation/d/1RjvxPpSymjwXxTsHy5QCvg9ZA7iOygn7fPSvsc4CUlk/edit?slide=id.p23#slide=id.p23)\
using this for main guide because it covers the rules and everything about it, except the coding.
Used to understand postfix rules and evaluation logic.
