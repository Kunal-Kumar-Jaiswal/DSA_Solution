import java.util.*;
public class InfixToPrefix {

    int top=-1;
    char[] a= null;
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in); 
       InfixToPrefix pp= new InfixToPrefix();
       System.out.print("Enter the string: "); 
       String s= sc.next();
       pp.a= new char[s.length()];
       String result="";
       for(int i=s.length()-1;i>=0;i--) {
           char ch=s.charAt(i);

           if(Character.isLetterOrDigit(ch)) {
               result +=ch;
           }
           else if(ch==')') {
               pp.push(ch);
           }
           else if(ch=='(') {
               while(pp.a[pp.top]!=')') {
                result += pp.pop();
               }
               pp.pop();
           }
           else {
               while(pp.top!=-1 && pp.prec(ch)< pp.prec(pp.a[pp.top])) {
                   result += pp.pop();
               }
               pp.push(ch);
           }
       }
       while(pp.top!=-1) {
           result += pp.pop();
       }
       for(int i=result.length()-1;i>=0;i--) 
        System.out.print(result.charAt(i));
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
