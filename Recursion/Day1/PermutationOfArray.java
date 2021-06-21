/*  Write a function that takes in an array of unique integers and returns an
 array of all permutations of those integers in no particular order.
*/



import java.util.Scanner;

class Permutation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of arr: ");
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		
		permute(arr, 0 ,n-1);
	}
	
	static void permute(int arr[], int a, int b) {
		if(a == b) {
			for(int i = 0; i < arr.length; i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
		else {
			for (int i = a; i <= b; i++) {
				arr = swap(arr, a, i);
				permute(arr, a+1, b);
				arr = swap(arr, a, i);
			}
		}
	}
	
	static int[] swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
