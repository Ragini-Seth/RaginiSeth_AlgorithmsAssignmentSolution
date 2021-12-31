package com.greatlearning.utility;

public class LinearSearchImplementation {
	public int linearSearch(boolean arr[]) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == true) {
				count++;	
			}
		}
		
		return count;
	}
}
