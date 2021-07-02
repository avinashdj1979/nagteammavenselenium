package javapractice.arrays;

import java.util.Arrays;

import com.sun.tools.javac.code.Attribute.Array;

public class OneDArrayPassArray {
	
	public int[] changeArr(int[] a) {
		System.out.println(Arrays.toString(a));
		a[0] = 456;
		return a;
	}
}
