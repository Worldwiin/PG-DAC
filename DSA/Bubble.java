package Sorting;

public class Bubble {
	void bubble_sort(int a[]) {
		int i, j, t;
		boolean flag;
		for (i = a.length - 1; i > 0; i--) {
			flag = true;
			for (j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					flag = false;
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			} // j if(flag)//flag==true-----if true means no swap means sorted break;
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
		Bubble obj = new Bubble();
		obj.bubble_sort(a);
		obj.print_Array(a);
	}
}
