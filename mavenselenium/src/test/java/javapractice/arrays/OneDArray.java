package javapractice.arrays;

import java.util.Arrays;

public class OneDArray {
	
	public static void main(String[] args) {
		int[] arr = {211, 31, 41, 5};
		OneDArrayPassArray o1 = new OneDArrayPassArray();
		o1.changeArr(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void test() {
		
		int a = 2;
		//2 ,3 ,4, 5
		
		int[] arr = {211, 31, 41, 5}; // int arr[] // c, c++
		int[] arr2 = new int[4];
		//arr2 = {1 ,2, 3, 4}; - Not allowed we can either initialize with values 
		//or initialize with number

		System.out.println("Size of the array is " + arr.length);

//		for(int i = 0; i < arr.length; i += 1) {
//			System.out.println(arr[i]);
//		}
		
		int counter = 0;
		for(int num : arr) {
//			System.out.println(num);
			arr2[counter] = num;
			counter = counter + 1;
		}
		
		System.out.println("In array format " + Arrays.toString(arr2));
		
		arr2[3] = 50;
		
		for(int num : arr2) {
			System.out.println(num);
		}
		
//		arr2 = {1 ,2, 3, 4}; - Not allowed
		
		
		double[] dblArr = {2.2, 4.5, 4};
		
		String[] names = {"Ram" , "Rahim"};
		
		A obj1 = new A();
		A obj2 = new A();
		
		A[] aobjArr = {obj1, obj2};
		
	}

}
