package logarithmicAlgorithms;

import quadraticAlgorithms.Insertion;


public class Quick {
	
	public static void sort(Comparable a[]){
		
		sort(a, 0, a.length-1);
	
	}
	
	private static void sort(Comparable a[], int lo, int hi ){
		
		if(hi <= lo) return;
		
		//getting random pivot and replacing it with lo 
		int k = lo + (int)(Math.random() * ((hi - lo) + 1));
		exch(a, k, lo);
		
		//merge sort has too much overhead for tiny subarrays
		int CUTOFF = 7;
		if(hi <= lo + CUTOFF -1){
			Insertion.sort(a, lo, hi);
			return;
		}
		
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a,j+1, hi);
		

	}

	private static int partition(Comparable []a, int lo, int hi){
		

		
		//partition as lo is pivot 
		int i = lo;
		int j = hi + 1;
		
		while( true ){
			
			while(less(a[++i], a[lo])) 
				if(i == hi) break;
			
			while(less(a[lo], a[--j]))
				if(j == lo) break;
			
			if(i >= j)	break;
			exch(a, i, j);
			
		}
		
		exch(a, lo, j);
		return j;
		
	}
	
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}

	private static void exch(Comparable []a, int i, int j){
		
		if(i == j)return;
		
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		
	}

}
