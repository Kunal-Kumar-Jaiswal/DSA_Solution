// WAP a program to print all possible permutation of a string

import java.util.Scanner;

class PermutationOfString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		int n = str.length();
		
		permute(str, 0 ,n-1);
	}
	
	static void permute(String str, int a, int b) {
		if(a == b) {
			System.out.println(str);
		}
		else {
			for (int i = a; i <= b; i++) {
				str = swap(str, a, i);
				permute(str, a+1, b);
				str = swap(str, a, i);
			}
		}
	}
	
	static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
	}
}
