//code for Selection sort in java
package Sorting;

public class Selection {
	void selection_sort(int a[]) {
		int min, pos;
		for (int i = 0; i < a.length - 1; i++) {
			min = a[i];
			pos = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					pos = j;
				}
			}
			// Swap a[i] with a[pos]
			if (pos != i) {
				int temp = a[i];
				a[i] = a[pos];
				a[pos] = temp;
			}
		}
	}

	void print_Array(int a[]) {
		System.out.println("Array has:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " , ");
		}
		System.out.println(); // Print a new line at the end
	}

	public static void main(String args[]) {
		int a[] = { 55, 11, 22, 99, 33, 66, 44, 77, 88 };
		Selection obj = new Selection();
		obj.selection_sort(a); 
		obj.print_Array(a);
	}
}
