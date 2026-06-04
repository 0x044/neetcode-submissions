class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String s : tokens){
            char c = s.charAt(0);
            if(s.matches("^[+-]?\\d+$")){
                stack.push(Integer.parseInt(s));
            }
            if(s.matches("[+-/*]")){
                switch (c){
                    case '+': {
                        int opA = stack.pop();
                        int opB = stack.pop();
                        stack.push(opB + opA);
                        break;
                    }
                    case '-' : {
                        int opA = stack.pop();
                        int opB = stack.pop();
                        stack.push(opB - opA);
                        break;
                    }
                    case '/' : {
                        int opA = stack.pop();
                        int opB = stack.pop();
                        stack.push(opB / opA);
                        break;
                    }
                    case '*' : {
                        int opA = stack.pop();
                        int opB = stack.pop();
                        stack.push(opB * opA);
                        break;
                    }
                }
            }
        }
        return stack.pop();
    }
}
