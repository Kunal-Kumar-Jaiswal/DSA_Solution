/*	Bubble Sort
	Best case: O(n) [if array is alread sorted]
	Worst case: O(n^2) [if array is sorted in decending order]
	Average case: O(n^2) 
*/

import java.util.Scanner;

class BubbleSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//Taking inputs
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the elements of array: ");
		for(int i=0; i<size; i++) 
			arr[i] = sc.nextInt();
		
		//Applying Bubble Sort
		for(int i=0; i<size-1; i++) {
			boolean flag = false;
			for(int j=0; j<size-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false)
				break;
		}
		
		//Printing the sorted array
		System.out.print("Array after sort: ");
		for(int i=0; i<size; i++) 
			System.out.print(arr[i]+" ");
		
	}
}
