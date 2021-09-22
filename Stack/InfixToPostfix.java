import java.util.*;
public class InfixToPostfix {

    int top=-1;
    char[] a= null;
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in); 
       InfixToPostfix pp= new InfixToPostfix();
       System.out.print("Enter the string: "); 
       String s= sc.next();
       pp.a= new char[s.length()];
       for(int i=0;i<s.length();i++) {
           char ch=s.charAt(i);

           if(Character.isLetterOrDigit(ch)) {
               System.out.print(ch);
           }
           else if(ch=='(') {
               pp.push(ch);
           }
           else if(ch==')') {
               while(pp.a[pp.top]!='(') {
                System.out.print(pp.pop());
               }
               pp.pop();
           }
           else {
               while(pp.top!=-1 && pp.prec(ch)<= pp.prec(pp.a[pp.top])) {
                   System.out.print(pp.pop());
               }
               pp.push(ch);
           }
       }
       while(pp.top!=-1) {
           System.out.print(pp.pop());
       }

    }

    public void push(char ch) {
        a[++top]=ch;
    }

    public char pop() {
        char c= a[top];
        top--;
        return c;
    }

    public int prec(char ch) {
        switch(ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
}
