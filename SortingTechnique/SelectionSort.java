import java.util.Scanner;

class SelectionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//Taking inputs
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the elements of array: ");
		for(int i=0; i<size; i++) 
			arr[i] = sc.nextInt();
		
		//Applying Selection Sort
		for(int i=0; i<size-1; i++) {
			int min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		//Printing the sorted array
		System.out.print("Array after sort: ");
		for(int i=0; i<size; i++) 
			System.out.print(arr[i]+" ");
		
	}
}
