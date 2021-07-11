/* 	Binary Search
	Best case: O(1) [if data is found at the mid in first go]
	Worst case: O(logn) [if data is not found 
	Average case: O(logn)
*/

import java.util.Scanner;

class BinarySearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//Taking inputs
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the sorted array: ");
		for(int i=0; i<size; i++) 
			arr[i] = sc.nextInt();
		
		System.out.print("Enter the number which you want to find: ");
		int data = sc.nextInt();
		
		//Applying binary search technique
		boolean flag = false;
		int start = 0;
		int end = size-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(arr[mid] == data) {
				flag = true;
				System.out.println("Your data is at "+ (mid+1) +" position.");
				break;
			}
			else if(arr[mid] < data) 
				start = mid+1;
			else
				end = mid-1;
		}
		if(flag == false) 
			System.out.println("Your data is not in this array.");
	}
}
