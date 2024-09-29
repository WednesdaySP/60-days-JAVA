package LeetCode.GreekForGreeks;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&sortBy=submissions
public class ValidParenthesis {
    //time complexity : O(n), space: O(n)
    public static void main(String[] args) {
        System.out.println(ispar("({([{{{{{([})}}}}}])})"));//false
        System.out.println(ispar("()")); // true
    }
     //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<x.length();i++){
            char currchar=x.charAt(i);
            
            if(currchar=='(' || currchar=='{' || currchar=='['){
                stack.push(currchar);
            }
            
            else if(currchar==')' || currchar=='}' || currchar==']'){
                
                if(stack.isEmpty()){
                    return false;
                }
                
                char topchar=stack.pop();
                 if (!isMatchingPair(topchar, currchar)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
        
    }
    
       // Function to check if the opening and closing brackets match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
