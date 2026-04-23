
#  Reverse Polish Notation

### this project is to implement a ReversePolishNotation class designed to manipulate and calculate arithmetic expressions using stack-based algorithms. The class converts human-readable infix expressions (e.g., 5 + 3) to computer-efficient postfix notation (e.g., 5 3 +) and evaluates the resulting postfix expressions.
Installation is done by pulling from github and running it.
Usage is 
Resources and Citations


1. How to Run the Code
   Step 1: Save the File
   Copy the code into a file named ReversePolishNotation.java.
   Step 2: Add a Main Method
   To actually see it work, you need a main method at the bottom of the class (before the final }). Paste this in:
   Step 3: Compile and Execute
   Open your terminal or command prompt and type:
   bash
   javac ReversePolishNotation.java
   java ReversePolishNotation




2. What the Output Looks Like
   When you run the program, the console will show the "logic" of the stack in real-time. Here is a breakdown of what the reader will see:
   Part A: Infix to Postfix Conversion
   The code checks the "weight" (precedence) of each operator.
   text
   The precedence is: 1
   The precedence is: 2
   The precedence is: 1
   The precedence is: 1
   ... (continues for each operator)
   Postfix Result: 7 2 9 / + 3 5 * +

   Part B: Evaluating the Postfix
   The evaluatePostfix method prints the state of the stack every time it changes. It looks like this:
   text
   [7]              <-- 7 added
   [7, 2]           <-- 2 added
   [7, 2, 9]        <-- 9 added
   [7, 2, 9]        <-- Operator '/' found, popping 9 and 2
   [7, 0]           <-- 2/9 is 0, pushed back
   [7, 0]           <-- Operator '+' found, popping 0 and 7
   [7]              <-- 7+0 is 7, pushed back
   Final Calculation Result: 22
