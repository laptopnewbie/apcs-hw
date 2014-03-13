public class BinSearch{
    public int rbsearch(int term, int[] L, int high, int low){
	int hold = (high+low)/2;
	if (L[hold]==term){
	    return hold;
	}else if(L[hold] > term){
	    return rbsearch(term, L, hold, high);
	}else if(L[hold] < term){
	    return rbsearch(term, L, low, hold);
	}
	return -1;	
    }

    public int ibsearch(int term, int[] L){
	int low=0;
	int high=L.length;
	int hold=(high+low)/2;

	while (low != hold && high != hold){  
	    if (L[hold] == term)
		return hold;
	    else if(low == high-1){
		if (L[hold+1] == term)
		    return hold+1;
	    }
	    else if(L[hold] > term){
		high = hold;
	    }
	    else{
		low = hold;
	    }
	    hold = (high+low)/2;
	}
	return -1;
    }

    
}
