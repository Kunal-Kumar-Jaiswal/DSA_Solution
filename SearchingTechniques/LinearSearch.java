/*  Linear Search 
	Best case: O(1) [if data is found at 1st position]
	Worst case: O(n) [if data is not in the array or at the last position]
	Average case: O(n)  
*/

import java.util.Scanner;

class LinearSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//Taking inputs
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the elements of the array: ");
		for(int i=0; i<size; i++) 
			arr[i] = sc.nextInt();
		
		System.out.print("Enter the number which you want to find: ");
		int data = sc.nextInt();
		
		//Applying searching technique
		boolean flag = false;
		for(int i=0; i<size; i++) {
			if(arr[i] == data) {
				flag = true;
				System.out.println("Your data is at "+ (i+1) +" position.");
				break;
			}
		}
		if(flag == false) 
			System.out.println("Your data is not in this array.");
	}
}
