package andy.DevelopingKit;

import java.io.*;
import java.util.*;
import java.applet.*;
import java.awt.*;

import andy.UsefulMethod.*;

@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) {
	}
	
	public static void printArr(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void printArr(long[][] arr) {
		for (int y=0; y<arr.length; y++) {
			for (int x=0; x<arr[y].length; x++) {
				System.out.printf(Long.toString(arr[y][x]));
				System.out.printf(" ");
			}
			System.out.println("");
		}
	}

}

//"If the facts don't fit the theory, get new facts" --Albert Einstein 
