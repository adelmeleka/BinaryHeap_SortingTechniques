package BinHeap_SortingTechs;

import binaryHeap.Heap;
import logarithmicAlgorithms.Merge;
import logarithmicAlgorithms.Quick;
import quadraticAlgorithms.Insertion;
import quadraticAlgorithms.Selection;

public class TestBinaryHeap_SortingTechniques {
	public static void main(String[] args){
	
		//Testing Algorithms
//		Integer a [] = {5,3,7,2,9,0,1,8} ;
//		Integer a [] = {0,1,7,5,4,2,9};
		
//		Selection.sort(a);
//		Insertion.sort(a);
//		Merge.sort(a);
//		Quick.sort(a);
//		Heap.buildMaxHeap(a);
//		Heap.sort(a);
		


			
		//Testing
		long start;
		long finish;
		Integer [] a;

		int i = 1000;
		while( i != 200000){
			
			//Selection sort
			a = Tester.setRandomArray(i);
		
			start = System.currentTimeMillis();
			Selection.sort(a);
			finish = System.currentTimeMillis();
			
			Tester.recordTime(Tester.selectionSort, i, start, finish);
			
			//Insertion sort
			a = Tester.setRandomArray(i);
			
			start = System.currentTimeMillis();
			Insertion.sort(a);
			finish = System.currentTimeMillis();
			
			Tester.recordTime(Tester.insertionSort, i, start, finish);
			
			//Quick sort
			a = Tester.setRandomArray(i);
			
			start = System.currentTimeMillis();
			Quick.sort(a);
			finish = System.currentTimeMillis();
			
			Tester.recordTime(Tester.quickSort, i, start, finish);

			//MergeSort
			a = Tester.setRandomArray(i);
			
			start = System.currentTimeMillis();
			Merge.sort(a);
			finish =System.currentTimeMillis();
			
			Tester.recordTime(Tester.mergeSort, i, start, finish);
			
			//Heap Sort
			a = Tester.setRandomArray(i);
			
			start = System.currentTimeMillis();
			Heap.sort(a);
			finish = System.currentTimeMillis();
			
			Tester.recordTime(Tester.heapSort, i, start, finish);
			
			if(i == 8000)
				i = 10000;
			else if(i == 80000)
				i = 100000;
			else
				i *= 2;
			
		}
		
		//printing results
		
		System.out.println("\nSelection Sort {Size=Time}");
		Tester.displayResult(Tester.selectionSort);
		
		System.out.println("\nInsertion Sort {Size=Time}");
		Tester.displayResult(Tester.insertionSort);
		
		System.out.println("\nMerge Sort {Size=Time}");
		Tester.displayResult(Tester.mergeSort);
		
		System.out.println("\nQuick Sort {Size=Time}");
		Tester.displayResult(Tester.quickSort);
		
		System.out.println("\nHeap Sort {Size=Time}");
		Tester.displayResult(Tester.heapSort);
		
		
		
		
		
		

		
		
		
	
	}
}
