
public class ReversePolishNotation {

    static int evaluatePostfix(String input) {
        // input will always be '"7 2 + 9 / 3 5 * +"'
        // If its a number, add it to stack
        // if its a operator, take the last two from the stack, do the operation, and put the value back on the stack

        //read 2 numbers
        //put on stack
        //read operator
        //take 2 numbers
        //profome operation
        //put resosalt on stack


        //split string into list by space
        String[] parts = input.split(" ");
        Stack st = new Stack();

        for (String part : parts) {
            try {
                int x = Integer.parseInt(part);
                st.push(part);
                System.out.println(st);
            } catch (NumberFormatException e) {
                System.out.println(st);
                String y = st.pop();
                String z = st.pop();
                System.out.println(st);
                if (part.equals("+")) {
                    int w = Integer.parseInt(y) + Integer.parseInt(z);
                    st.push(String.valueOf(w));
                } else if (part.equals("-")) {
                    int w = Integer.parseInt(y) - Integer.parseInt(z);
                    st.push(String.valueOf(w));
                } else if (part.equals("/")) {
                    int w = Integer.parseInt(y) / Integer.parseInt(z);
                    st.push(String.valueOf(w));
                } else if (part.equals("*")) {
                    int w = Integer.parseInt(y) * Integer.parseInt(z);
                    st.push(String.valueOf(w));
                } else {
                    System.out.println("invalid opperater found");
                }

            }

            // if part is a number, add it to the stack
            // if its an operator, remove the last two numbers from the stack, do that operation and put the value back on the stack
        }

        return (Integer.parseInt(st.pop()));
    }

    // Level 3: ^
    // Level 2: *, /
    // Level 1: +, -
    // Level 0: (
    static int Precedence(String op) {

        int precedence = -1;

        switch (op) {
            case "^": {
                precedence = 3;
                break;
            }
            case "*":
            case "/": {
                precedence = 2;
                break;
            }
            case "+":
            case "-": {
                precedence = 1;
                break;
            }
            case "(": {
                precedence = 0;
                break;
            }
            default: {
                System.out.println("Invalid operator");
            }
        }

        System.out.println("The precedence is: " + precedence);

        return (precedence);
    }

    //Takes in an infix expression as a String, converts it to a postfix expression and returns it
    static String infixToPostfix(String input) {
        String[] parts = input.split(" ");
        Stack st = new Stack();
        String output = "";

        for (String part : parts) {
            switch (part) {
                case "(":
                    st.push(part);
                    break;
                case ")":
                    while (!st.isEmpty() && !st.peek().equals("(")) {
                        output += st.pop() + " ";
                    }
                    st.pop(); // Remove the "("
                    break;
                case "^":
                case "*":
                case "/":
                case "+":
                case "-":
                    // Use a WHILE loop to pop all higher/equal precedence operators
                    while (!st.isEmpty() && !st.peek().equals("(") && Precedence(st.peek()) >= Precedence(part)) {
                        output += st.pop() + " ";
                    }
                    st.push(part);
                    break;
                default:
                    // Numbers go straight to output, not the stack
                    output += part + " ";
                    break;
            }
        }

        // FINAL STEP: Pop everything remaining in the stack
        while (!st.isEmpty()) {
            output += st.pop() + " ";
        }

        return output.trim();
    }}

