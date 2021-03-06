/*
Selection Algorithms - Find kth smallest value
findkth(int[] L, int k)

1. NAIVE Through each time - find minimum value (remove or new array)
for (------kth times------)            RUN-TIME = O(n^2)
   for (------through array------)

2. BETTER Sort the list (nlogn built-in sort)
pluck out kth element                  RUN-TIME = O(nlogn) + O(k)

3. BEST Quick Select - Partitioning the list (in linear time)
LF 9th smallest element
Choose random value from array
Put it in the middle and surround it with integers smaller/greater
Ex.  2 3 6 4 2 [ 7 ] 14 10 8 9 12
7 is the 6th term (need 9th)
Discard terms 0 to 5
Repeat with latter half

*/

//DOESN'T WORK
import java.util.*;
public class SelectAlg{

    public static int QuickSelect(int[] L, int k, int low, int high){

	if (low >= high){
	    return L[high];

	}else{
	    Random rand = new Random();
	    int pivot = L[low + rand.nextInt(high-low)];
	    int[] left = new int[high-low];
	    int[] right = new int[high-low];
	    int countlow = low;
	    int counthigh = high;
	    int term = 0;
	    for (int a = 0; a < (high-low); a++){
		System.out.println(countlow);
		if (L[a] < L[pivot]){
		    left[countlow] = L[a];
		    countlow++;
		}else if(L[a] > L[pivot]){
		    right[counthigh] = L[a];
		    counthigh = counthigh-1;
		}else{
		    term = countlow+1; //or counthigh-1
		}
	    }
	    if (term == k){
		return pivot;
	    }else if(term > k){
		QuickSelect(left,k,0,countlow);
	    }else{
		QuickSelect(right,k,counthigh,high);
	    }
	}
	return -1;
    }

    public static void main(String[]args){
	int[] law = {3, 12, 4, 9, 18, 7, 10};
	System.out.println(QuickSelect(law,4,0,5));
    }
}
	  		    

	    







	    /*
	      1. Choose pivot (randomly)
	      2. Partition about the pivot (left and right of pivot)
	      3. If pivot at location k then we're done :D
	      4. QuickSelect(on either left or right by redefining high&low)

	      Choosing a pivot:
	      - Worst case = pivot is max/min
	      - Best case = middle term
	           RUN-TIME = n   +  (n/2)+(n/4)+(n/8)...
		             [n]  +  [         n        ]
			     O(n+n)
	      - Typical case = choosing random partition produce balanced results
	      
	      "The pivot in now in what would be its proper position if the array was sorted."
	      Use QuickSelect on BOTH sides => sorted array
	      We have discovered the mighty QUICKSORT Algorithm
	      QuickSort(int[] L, int low, int high){
	         if len <= 1 
		    return it
		 else
		    select pivot randomly
		    partition list into lower and upper pieces
		    QuickSort upper half
		    QuickSort lower half
		    Combine if we need to
	      }
	      copy to 2 new arrays and .add/etc CHEAT-
	      lower = A.toArray()
	      upper = B.toArray()
	      , recurse, copy back
	     
	      RUN-TIME
	        Worst - max/min pivot repeatedly n^2
		Typical/Decent - middle pivot (n/2) + (n/2) = O(nlogn)
	    */
