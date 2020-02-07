package binaryHeap;

public class Heap {

	//array representation starting from index 1
	private static int heapSize;
	private static int arrayLength;
	
	public static void buildMaxHeap(Comparable[] a){
		
		arrayLength = a.length;
		heapSize = arrayLength -1;
		
		for(int k=heapSize/2; k>=1; k--)
			maxHeapify(a,k);
			
	}
	
	public  static void sort(Comparable[] a){
		
		buildMaxHeap(a);
		
		//Sorting by removing max
		while( heapSize > 1){
			
			exch(a,1,heapSize--);
			maxHeapify(a,1);
			
		}	
		
	}
	
	private static void maxHeapify(Comparable []a, int k){
		
		while( 2*k <= heapSize){
			
			int j = 2 * k;
			if(j+1 < heapSize && less(a[j], a[j+1]))
				j++;
			if(!less(a[k], a[j]))	break;
			exch(a, k, j);
			k = j;
			
		}
		
				
	}
	
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}

	private static void exch(Comparable []a, int i, int j){
		
		if(i==j)return;
		
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		
	}
}
