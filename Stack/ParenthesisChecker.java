import java.util.*;
public class ParenthesisChecker {

    int top=-1;
    char[] a= null;
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in); 
       ParanthesisMatching pp= new ParanthesisMatching();
       System.out.print("Enter the string: "); 
       String s= sc.next();
       pp.a= new char[s.length()];
       boolean flag=true;
       for(int i=0;i<s.length();i++) {
           char ch=s.charAt(i);

           if(ch=='(' || ch=='{' || ch=='[') {
               pp.push(ch);
           }
           else {
               if(pp.top!=-1 && pp.prec(ch)==pp.prec(pp.a[pp.top])) {
                   pp.pop();
               }
               else {
                   flag = false;
                   break;
               }
           }
       }
       if(flag==true && pp.top==-1) {
           System.out.print("Balanced");
       }
       else {
            System.out.print("Not Balanced");
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
            case '(':
            case ')':
                return 1;
            case '{':
            case '}':
                return 2;
            case '[':
            case ']':
                return 3;
        }
        return -1;
    }
    
}
