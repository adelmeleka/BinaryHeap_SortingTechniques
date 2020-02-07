package logarithmicAlgorithms;

import quadraticAlgorithms.Insertion;

public class Merge {
	
	private static void merge(Comparable a[], Comparable aux[], int lo,int mid, int hi ){
		
		//copy to auxilary array
		for(int i=lo; i<=hi; i++)		
			aux[i] = a[i];
		
		//merging
		int i = lo;
		int j = mid + 1; 
		for(int k =lo; k<=hi; k++){
			
			if(i > mid)		
				a[k] = aux[j++];
			
			else if(j > hi)		
				a[k] = aux[i++];
			
			else if(less(aux[j], aux[i]))
				a[k] = aux[j++];
			
			else 
				a[k] = aux[i++];
			
		}
		
	}

	public static void sort(Comparable a[]){
		
		Comparable aux [] = new Comparable[a.length];
		sort(a, aux, 0, a.length-1);
			
	}
	
	private static void sort(Comparable a[], Comparable aux[], int lo, int hi){

		//merge sort has too much overhead for tiny subarrays
		int CUTOFF = 7;
		if(hi <= lo + CUTOFF -1){
			Insertion.sort(a, lo, hi);
			return;
		}
		
		
		//recursive formula
		if(lo >= hi)	return;
		
//		int mid = (lo + hi) / 2;
		int mid = lo +(hi -lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		
		//stop if already sorted
		if(!less(a[mid+1], a[mid]))	return;
		
		merge(a, aux, lo, mid, hi);
		
	}
	
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}

}
