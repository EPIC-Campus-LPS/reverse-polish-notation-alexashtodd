public class ReversePolishNotation {
    static int[] GetNumsPost(String[] input) {
        int[] stack = {};
        stack = new int[input.length];

        for (int i = 0; i < input.length;i++) {
            int x = 0;
            try{

                x = Integer.parseInt(input[i]);

            } catch (NumberFormatException e) {
                break;
            }
            stack[i] = x;
            stack[stack.length -1] = i; // idea is to save i for operation funtion(later)
        }
        return(stack);
    }
    static String ProformOpration(String[] input,int[] input1){ //input contands the list of parts,ex:7 2 + 9 / 3 5 * +.
        // input1 contans a array of numbers with a buffor of 0s with the last index having where the numbers end and the 0s start.
        String op =input[1+input1[input1.length-1]]; // can only be operation
        int[] nums = new int[input1[input1.length-1]]; // array to profom operations on
        for(int i = 0;i <= input1[input1.length-1];i++){ //moving numbers from input1 to nums
            nums[i] = Integer.parseInt(input[i]);
        }




        return(op);
    }
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
                st.push(x);
            } catch (NumberFormatException e) {

                break;
            }

            // if part is a number, add it to the stack
            // if its an operator, remove the last two numbers from the stack, do that operation and put the value back on the stack
        }

        // If its a number, add it to stack
        int[] nums = GetNumsPost(parts);
        ProformOpration(parts,nums);


        return(1);
    }
//    static String infixToPostfix(String input){
//
//    }
}
