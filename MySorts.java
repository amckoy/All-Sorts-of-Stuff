public class MySorts{
    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) 
    {
	for(int j = 0; j < data.size() - 1; j++){
	    Comparable least = data.get(j);
	    int leastIndex = j;
	    for(int i = j + 1; i < data.size(); i++){
		if(data.get(i).compareTo(least) < 0){
		    least = data.get(i);
		    leastIndex = i;
		}
	    }
	    data.set(leastIndex, data.get(j));
	    data.set(j, least);
	}
    }//end selectionSort -- O(n^2)


    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> 
	selectionSort( ArrayList<Comparable> input ) 
    {
	ArrayList<Comparable> sorted = new ArrayList(input);
	selectionSortV(sorted);
	return sorted;
	
    }//end selectionSort -- O(n^2)

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data ) {
	for(int j = 1; j < data.size() - 1; j++){
	    for(int i = data.size() - 1; i > 0; i--){
		if(data.get(i).compareTo(data.get(i-1)) < 0){
		    Comparable holder = data.get(i);
		    data.set(i, data.get(i-1));
		    data.set(i-1, holder);
		}
	    }
	}
    }//end bubbleSortV -- O(n^2)


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ){
	ArrayList<Comparable> sortedCopy = new ArrayList(input);
	bubbleSortV(sortedCopy);
	return sortedCopy;
    }//end bubbleSort -- O(n^2)
}
    
   
