/*	Insertion Sort
	Best case: O(n) [if array is alread sorted]
	Worst case: O(n^2) [if array is sorted in decending order]
	Average case: O(n^2) 
*/

import java.util.Scanner;

class InsertionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//Taking inputs
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the elements of array: ");
		for(int i=0; i<size; i++) 
			arr[i] = sc.nextInt();
		
		//Applying Insertion Sort
		for(int i=1; i<size; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		//Printing the sorted array
		System.out.print("Array after sort: ");
		for(int i=0; i<size; i++) 
			System.out.print(arr[i]+" ");
		
	}
}
