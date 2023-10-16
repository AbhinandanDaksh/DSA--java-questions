import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()){
            return false;
        }

        char[] arr=s.toCharArray();
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<arr.length;i++){
            char curr=arr[i];
            if(curr=='(' || curr=='{'|| curr=='['){
                stack.push(curr);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                char top=stack.peek();
                if((top=='(' && curr==')')||
                    (top=='{' && curr=='}')||
                    (top=='[' && curr==']')){
                        stack.pop();
                    }
                else{
                    return false;
                }
            }
        }
        if(stack.size()>0){
            return false;
        }
       return true; 
    }
}
