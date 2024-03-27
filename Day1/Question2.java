package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class MyStack {
    private Stack<Integer> stack;
    public MyStack() {
        stack = new Stack<>();
    }
    public void push(int x) {
        stack.push(x);
    }
    public int pop() {
        return stack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public boolean empty() {
        return stack.isEmpty();
    }
}

public class Question2 {
    public static void main(String[] args) {
        MyStack myS = new MyStack();
        Scanner sc=new Scanner(System.in);
        String [] operations=sc.nextLine().split(" ");
        int i=1;
        List<String> l=new ArrayList<>();
        boolean f=false;
        
        for (String operation : operations) {
            switch (operation) {
                case "MyS":
                    l.add("null");
                    f=true;
                    break;
                case "push":
                    if(f){
                        myS.push(i); 
                        l.add("null");
                        i++;
                        break;
                    }
                case "top":
                    if(f){
                        l.add(String.valueOf(myS.top()));
                        break;
                    }
                case "pop":
                    if(f){
                        if(i<1){
                            l.add("underflow");
                        }
                        l.add(String.valueOf(myS.pop()));
                        i--;
                        break;
                    }
                case "empty":
                    if(f){
                        l.add(String.valueOf(myS.empty()));
                        break;
                    }
            }
        }
        for(String s:l){
            System.out.print(s+" ");
        }
        sc.close();
    }
}
