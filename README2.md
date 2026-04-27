
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
## Resources and Citations
