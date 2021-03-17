package hello;

import java.util.Arrays;

public class hello {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array [] = {1,4,2,2,3,1,5,6,6,4,3};
		arrayFunction(array);

	}
	
	
	
	static void arrayFunction(int [] myArray) {
		
		// Sorting array 
			Arrays.sort(myArray);
			int i = 0;
			System.out.println("Uniqe Element:");
			while (i < myArray.length-1) {
				if( myArray[i] != myArray[i+1]) {
						System.out.print(" "+myArray[i]);
				}
				//jumping always to two adjacent values 
				i = i+2;
			}
		}

	}
