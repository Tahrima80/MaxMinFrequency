package com.naztech.MaxAndMinFrequency;

public class ArrayMaxAndMinFreq {
	
	public static int maxFrequency() {
		int[] numArray = {1, 2, 3, 4, 5, 3, 5, 1, 1, 1, 6, 8, 4};
		int freq = 0;
		int maxFreq = 0;
		
		for(int i = 0; i<numArray.length; i++) {
			for(int j = 0; j<numArray.length; j++ ) {
				if(numArray[i]==numArray[j]) {
					freq++;
				}
			}
			if(freq>maxFreq) {
				maxFreq = freq;
			}
			freq = 0;
		}
		return maxFreq;
	}
	
	public static int minFrequency() {
		int[] numArray = {1, 2, 3, 4, 5, 3, 5, 1, 1, 1, 6, 8, 4};
		int freq = 0;
		int minFreq = 1;
		
		for(int i = 0; i<numArray.length; i++) {
			for(int j = 0; j<numArray.length; j++ ) {
				if(numArray[i]==numArray[j]) {
					freq++;
				}
			}
			if(freq<minFreq) {
				minFreq = freq;
			}
			freq = 0;
		}
		return minFreq;
	}

}
