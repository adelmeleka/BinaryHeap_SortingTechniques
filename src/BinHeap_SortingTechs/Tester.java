package BinHeap_SortingTechs;

import java.util.HashMap;

public class Tester {
	
	
//	static Integer [] a;
	int size ;
	
	//HashMaps of <size ,time> values
	static HashMap<Integer,Long> heapSort = new HashMap<Integer,Long>();
	static HashMap<Integer,Long> mergeSort = new HashMap<Integer,Long>();
	static HashMap<Integer,Long> quickSort = new HashMap<Integer,Long>();
	static HashMap<Integer,Long> insertionSort = new HashMap<Integer,Long>();
	static HashMap<Integer,Long> selectionSort = new HashMap<Integer,Long>();
	
	
	public static Integer[] setRandomArray(int size){
		
		Integer []a  = new Integer [size];
		a[0] = 0;
		for(int i = 1; i<size; i++)
			a[i] = (int)(1+Math.random()*(100-1));
		
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i]+ " ");
		
		return a;
	}
	
	public static void recordTime(HashMap<Integer, Long> hashmap,int size, long start, long finish){
	
		hashmap.put(size,(finish-start));
		
	}

	public static void displayResult(HashMap<Integer, Long> hashmap){

		System.out.println(hashmap);
		
	}
	
	
}
