package Day1;

import java.util.Scanner;
import java.util.Stack;

class Question1{
    public static int helper(String[] str){
        Stack<String> stack = new Stack<>();
        for (String word : str) {
            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop(); 
            } else {
                stack.push(word); 
            }
        }
        return stack.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(helper(str.split(" ")));
        sc.close();
    }
}