/*I tend to take more notes than write actual working code...end lamentation 1/?
*/

import java.util.*;
public class quickSort{

    public static Integer[] QuickSort(Integer[] L, int low, int high){
	if (L.length <= 1){
	    return L;
	}else{
	    Random rand = new Random();
	    int pivoter = L[low + rand.nextInt(high+low)];
	    Integer pivot = (Integer)pivot;
	    ArrayList<Integer> left = new ArrayList<Integer>(L.length);
	    ArrayList<Integer> right = new ArrayList<Integer>(L.length);
	    int term = 0;
	    for (int a = 0; a < L.length; a++){
		if (L[a] < pivot){
		    left.add(L[a]);
		}else if (L[a] > pivot){
		    right.add(L[a]);
		}else{
		    term = L[a];
		}
	    }
	    

	    Integer[] lower = left.toArray(new Integer[]{});
	    Integer[] higher = right.toArray(new Integer[]{});
	    
	    Integer[] res = new Integer[L.length];

	    // based off stackoverflow example:
	    /*int[] array1and2 = new int[array1.length + array2.length];
	      System.arraycopy(array1, 0, array1and2, 0, array1.length);
	      System.arraycopy(array2, 0, array1and2, array1.length, array2.length);*/
	    System.arraycopy(QuickSort(lower,low,term),0,res,0,lower.length);
	    System.arraycopy(QuickSort(higher,term,high),0,res,lower.length,higher.length);

	    
	    return res;

	}
    }

    public static int partition(int[] L, int left, int right){
	


    

    public static void main(String[]args){
	Random rand = new Random();
	int n = 10;
	Integer[] a = new Integer[n];
	for (int c = 0; c<n; c++){
	    a[c] = new Integer(rand.nextInt(100));
	    // System.out.println(Arrays.toString(a));
	}

	System.out.println(QuickSort(a,0,9));
	// where these index out of range come from in making my pivot?
    }
}
/* March 13, 2014
OPTIMIZATION OF MIGHTY QUICKSORT
1. Choose decent pivot
2. Swap pivot with value at far right for temporary storage
3. Another variable "wall" that partitions Left+Right
4. Loop int i from Left to Right-1
   Swap element at i with element at wall if less than pivot, wall++
   End: Swap wall and pivot (same position)

1. int partition(int[] a, int L, int R)
        return the index of the pivot
2. quickSort2(...)
        use partition
 */

/* March 14, 2014
COMPARING SORTING ALGORTIHMS
Insertion     100,000 items     5 seconds
Selection     100,000 items    12 seconds
Merge         10 mil. items     4 seconds
              40 mil. items    17 seconds
              50 mil. items     Out of Heap space/memory - multiple arrays of 50 million
Quick(#)      10 mil. items     9 seconds            
              40 mil. items     Out of Heap space/memory - slower than Arraylist
                                                           Integers into and from Arraylists
Quick2(##)    .5 mil. items     Stack overflow error - range of dataset too small
              10 mil. items     6 or 2 seconds
	     100 mil. items    19 seconds
Quick3        10 mil. items     2 seconds
              40 mil. items     7 seconds

 (#) copy to and from Arraylists in Partition
(##) in place Partition

Note: quickSelect is most likely linear but quickSort ranges from nlogn to n^2
Mergesort takes more memory, is slower than quickSelect, but quickSelect's results vary.
quickSelect's runtime is unpredictable and depends on data set size

MODIFY QUICKSELECT FURTHER - THE CATACLYSMIC QUICKSORT3
make wall2
move the pivot duplicates to left beforehand

CHOOSING PIVOT
Method 1 "Median of medians" - Find median every 5 items, put medians into array, find median of array
Method 2 - take first, middle, last items and find the median of those

WHY HENDERSON CHEATED ON JAVA WITH PYTHON
i forget.
*/