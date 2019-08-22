package andy.DevelopingKit;

import java.io.*;
import java.util.*;
import java.applet.*;
import java.awt.*;

import andy.UsefulMethod.*;

@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) {
		System.out.println(AndyMath.getFactorial(4l));
	}
	
	public static void printArr(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
