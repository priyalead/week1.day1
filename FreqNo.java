package week1.day2;

import java.util.Arrays;

public class FreqNo {

	public static void main(String[] args) {
    
	int [] arr = {3,1,5,1,2,3,2,1,3,2,4,4,1,3,5,6};
	int freq = 1;
	 Arrays.sort(arr);
	 for( int i =0; i<arr.length;i++) {
		 if(arr.length != i+1) {
			 
		 
		 if(arr[i] == arr[i+1]) {
			 freq++;
		 } else {
			 System.out.println(arr[i] + " occured " + freq + " times");
			 freq = 1;
		 }
		 
		 } else {
			 System.out.println(arr[i] + " occured " + freq + " times");
		 }
//	 System.out.println(arr[i]);
	 }
	
     
	}

}
