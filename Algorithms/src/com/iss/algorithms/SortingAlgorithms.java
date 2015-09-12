package com.iss.algorithms;

public class SortingAlgorithms {
	public static int[] selectionSort(int[] a) {
		int i, j, minIndex, temp;
		int size = a.length;
		for (i = 0; i < size - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < size; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;

		}
		return a;
	}

	public static int[] insertionSort(int[] a) {
		int i, j, temp;
		int size = a.length;
		for (i = 1; i < size; i++) {
			for (j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}

		return a;
	}

	public static void main(String[] args) {
		int[] ar = { 10, 20, 90, 30, 40 };
		int[] ss = selectionSort(ar);
		System.out.println("Selection Sort");
		for (int i : ss) {
			System.out.print(i + ",");

		}
		System.out.println("\n");
		int[] is = insertionSort(ar);
		System.out.println("Insertion Sort");
		for (int i : is) {
			System.out.print(i + ",");
		}
	}
}
