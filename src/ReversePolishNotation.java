public class ReversePolishNotation {
    static int evaluatePostfix(String input){
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

        for(String part: parts){
            try{
                int x = Integer.parseInt(part);
                st.push(part);
                System.out.println(st);
            } catch (NumberFormatException e) {
                System.out.println(st);
                String y = st.pop();
                String z = st.pop();
                System.out.println(st);
                if(part .equals("+")){
                    int w = Integer.parseInt(y) + Integer.parseInt(z);
                    st.push(String.valueOf(w));
                } else if (part.equals("-")) {
                    int w = Integer.parseInt(y) - Integer.parseInt(z);
                    st.push(String.valueOf(w));
                } else if (part.equals("/")) {
                    int w = Integer.parseInt(y) / Integer.parseInt(z);
                    st.push(String.valueOf(w));
                } else if (part .equals("*")) {
                    int w = Integer.parseInt(y) * Integer.parseInt(z);
                    st.push(String.valueOf(w));
                }else{
                    System.out.println("invalid opperater found");
                }

            }

            // if part is a number, add it to the stack
            // if its an operator, remove the last two numbers from the stack, do that operation and put the value back on the stack
        }

        return(Integer.parseInt(st.pop()));
    }

    static String infixToPostfix(String input) {
        //Takes in an infix expression as a String, converts it to a postfix expression and returns it
        String[] parts = input.split(" ");
        Stack st = new Stack();
        String temp = "";
        String output = "";

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals("^")) {
                System.out.println("^");
                if(!st.isEmpty() && !st.peek().equals("(") && Precedence(st.peek()) >= Precedence(parts[i])){
                    temp = st.pop();
                    output = String.join("",output,temp);
                    st.push(parts[i]);
                }
            } else if (parts[i].equals("*") || parts[i].equals("/")) {
                System.out.println("*/");
                if(!st.isEmpty() && !st.peek().equals("(") && Precedence(st.peek()) >= Precedence(parts[i])){
                    temp = st.pop();
                    output = String.join("",output,temp);
                    st.push(parts[i]);
                }
            } else if (parts[i].equals("+") || parts[i].equals("-")) {
                System.out.println("+-");
                if(!st.isEmpty() && !st.peek().equals("(") && Precedence(st.peek()) >= Precedence(parts[i])){
                    temp = st.pop();
                    output = String.join("",output,temp);
                    st.push(parts[i]);
                }
            } else if (parts[i].equals("(")) {
                System.out.println("(");
                st.push("(");

            } else if (parts[i].equals(")")) { //todo Pop operators from the stack and add them to the output
                // todo until you reach a left parenthesis (. Pop and discard the (
                    System.out.println(")");

            } else { //todo add them directly to the output string
                try {
                    System.out.println("num" + parts[i]);
                } catch (NumberFormatException e) {
                    System.out.println("no vailed return");
                }
            }
        }
        return("hello");
    }
    static int Precedence(String op){ //todo finish
//        Level 3: ^
//        Level 2: *, /
//        Level 1: +, -
//        Level 0: (
        return(1);
    }






}
