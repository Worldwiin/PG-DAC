//code for Quick sort in java
package Sorting;

public class Quick {
	void quick_sort(int a[], int start, int end) {
		int i, j, pivot;
		i = start;
		j = end;
		pivot = start;// start j:end while(i < j)
		{
			while (a[i] < a[pivot])
				i++;
			while (a[j] > a[pivot])
				j--;
			if (i < j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		if (i < end)
			quick_sort(a, i + 1, end);
		if (j > start)
			quick_sort(a, start, j - 1);
	}

	void print_Array(int a[]) {
		System.out.println("Array has:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " , ");
		}
	}

	public static void main(String args[]) {
		int a[] = { 55, 11, 22, 99, 33, 66, 44, 77, 88 };
		Quick obj = new Quick();
		obj.quick_sort(a,0,a.length-1);
		obj.print_Array(a);
	}
}
