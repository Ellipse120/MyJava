package com.lusai.day3;

public class QuickSort {

	public static int Partition(int a[], int p, int r) {//p likes start,q likes end;
		int x = a[r - 1];
		int i = p - 1;
		int temp;
		for (int j = p; j <= r - 1; j++) {
			if (a[j - 1] <= x) {
				// swap(a[j-1],a[i-1]);
				i++;
				temp = a[j - 1];
				a[j - 1] = a[i - 1];
				a[i - 1] = temp;

			}
		}
				// swap(a[r-1,a[i+1-1]);
		temp = a[r - 1];
		a[r - 1] = a[i + 1 - 1];
		a[i + 1 - 1] = temp;

		return i + 1;

	}

	public static void QuickSort(int a[], int p, int r) {

		if (p < r) {
			int q = Partition(a, p, r);
			QuickSort(a, p, q - 1);
			QuickSort(a, q + 1, r);

		}

	}

	public static void main(String[] args) {

		int a[] = { 342, 53, -77, 36, 99, 76, 55, 13, 45, 3 };
		
		QuickSort(a, 1, a.length);

		for (int i = 1; i <= a.length; i++){
		
			System.out.print(a[i - 1] + " ");
		
		}
	}

}