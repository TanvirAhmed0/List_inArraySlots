/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    public String[] intHolder;
    public String[] extraHolder;
    private int size;
    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
      intHolder = new String[10];
      size = 0;
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
      return size;
    }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
        String finalString = "[";
        for(String element : intHolder) {
            if (element != null) 
                finalString += ", " + element;
        }
        finalString += "]";
        return finalString;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
      if(size == intHolder.length){
        intHolder.expand();
      } 
      else{
        intHolder[size - 1] = value;
      }
      size++;
     }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     // private void expand() {
        // System.out.println( "expand... (for debugging)");
           // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during 
              // development, the programmer must verify that 
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
     // }
}
