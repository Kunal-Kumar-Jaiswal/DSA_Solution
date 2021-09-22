import java.util.*;
public class PostfixToInfix {

    int top=-1;
    String[] a= null;
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in); 
       PostfixToInfix pp= new PostfixToInfix();
       System.out.print("Enter the string: "); 
       String s= sc.next();
       pp.a= new String[s.length()];
       for(int i=0;i<s.length();i++) {
           char c=s.charAt(i);
            String ch= String.valueOf(c);
           if(Character.isLetterOrDigit(c)) {
               pp.push(ch);
           }
           else {
               String A=pp.pop();
               String B=pp.pop();
               pp.push("("+B+ch+A+")");
           }
       }
       System.out.print(pp.pop());
    }

    public void push(String ch) {
        a[++top]=ch;
    }

    public String pop() {
        String c= a[top];
        top--;
        return c;
    }
    
}
