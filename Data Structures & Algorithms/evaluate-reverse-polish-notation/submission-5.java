class Solution {
    public int evalRPN(String[] tokens) {
        /*
            loop String
            push on to stack if operands
            pop 2 elements from stack if operators {
                push the result back to stack
            }
        */
        int a=0, b=0;
        Stack<Integer> stck = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                if(stck.size()>= 2){
                    b = stck.pop();
                    a = stck.pop();
                }else
                    return 0;
                int result = applyOperation(a,b,token);    
                stck.push(result);

            }else{
                stck.push(Integer.parseInt(token));
            }

        }
        return stck.pop();

    }
    public int applyOperation(int a, int b, String operator){
        switch(operator){
            case "+":{
                return a+b;
            }
            case "-":{return a-b;}
            case "*":{return a*b;}
            case "/":{
                if (b == 0) {
                throw new ArithmeticException("Division by zero");
                }
                return a/b;}

        }
        return 0;
    }
}






