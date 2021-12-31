package com.greatlearning.utility;

public class BinarySearchImplementation {
	
	public void searchValue(double arr[], double key) {
		int l = 0;
		int r = arr.length - 1;
		int mid = l + (r - l) / 2;

		while (l <= r) {
			if (key < arr[mid]) {
				// range is l to mid-1
				r = mid - 1;
			} else if (key > arr[mid]) {
				// range is mid+1 to r
				l = mid + 1;
			} else {
				System.out.println("Stock of value " + key + " is present ");
				break;
			}
			mid = l + (r - l) / 2;
		}

		if (l > r) {
			System.out.println("Value not found");
		}
	}
}
