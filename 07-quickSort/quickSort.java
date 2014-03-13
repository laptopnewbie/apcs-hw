import java.util.*;
public class quickSort{

    public static Integer[] QuickSort(Integer[] L, int low, int high){
	if (L.length <= 1){
	    return L;
	}else{
	    Random rand = new Random();
	    int pivot = L[low + rand.nextInt(high+low)];
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
