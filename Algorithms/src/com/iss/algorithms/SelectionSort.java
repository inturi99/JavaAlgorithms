package com.iss.algorithms;

public class SelectionSort {
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
public static void main(String[] args) {
	int[] ar1={10,20,90,30,40};
	int[] ar2=selectionSort(ar1);
	for(int i:ar2){
		System.out.print(i +",");
		
	}
}
}
