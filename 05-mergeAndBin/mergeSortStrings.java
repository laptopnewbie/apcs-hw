import java.util.*;
public class mergeSortStrings{

    public ArrayList<Comparable> mergeSort(ArrayList<Comparable> L){
        if (L.size()<=1){
            return L;
        }

        ArrayList<Comparable> one = new ArrayList<Comparable>(L.size()/2);        
        int index;
        for (index = 0;index<L.size()/2;index++){
            one.add(index,L.get(index));
        }
	ArrayList<Comparable> two = new ArrayList<Comparable>(L.size() - L.size()/2);
        for (;index<L.size();index++){
            two.add(index-one.size(),L.get(index));
	}
        one = new ArrayList<Comparable>(mergeSort(one));
	two = new ArrayList<Comparable>(mergeSort(two));
        L = new ArrayList<Comparable>(merge(one,two));
        return L;
    }


     public ArrayList<Comparable> merge(ArrayList<Comparable> one,ArrayList<Comparable> two){
        int size1 = 0;
        int size2 = 0;

        ArrayList<Comparable> res = new ArrayList<Comparable>(one.size() + two.size());
        for (int a = 0; a<one.size()+ two.size();a++){
            if (size1 == one.size()){
		res.add(a,two.get(size2));
                size2++;
            }
            else if (size2 == two.size() ){
		res.add(a,one.get(size1));
                size1++;
            }
            
	    else if(one.get(size1).compareTo(two.get(size2)) <= 0){
                res.add(a,one.get(size1));
		size1++;
            }
            else{
                res.add(a,two.get(size2));
                size2++;
            }
        }
        return res;
     }



    public static void main(String[]args){
        ArrayList<String> cho = new ArrayList<String>();
	cho.add("Hi");
	cho.add("Bye");
	cho.add("Ace");
        System.out.println(mergeSort(cho));
    }
}
