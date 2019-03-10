# List_inArraySlots

## Tanvir Ahmed and Oliver Cai

## Fields
-  int[] intHolder - Holds all the elements of our list
-  int[] extraHolder - Acts a spare array to hold our elements whenever we expand
-  int size - The number of elements in our list
## Constructors
-  List_inArraySlots - instantiates intHolder with 10 slots and sets size to 0
## Methods
- int size() - returns the current size of the list
- String toString() - returns all of the elements in the list in String form
- boolean add(int value) - appends a value to the end of the list
```
public boolean add( int value) {
      size++;
      if(size == intHolder.length){
        expand();
      } 
        intHolder[size - 1] = value;
      return true;
     }
```
- void expand() - expands intHolder to accomadate more values
```
private void expand() {
        int[] extraHolder = new int[size];
        for(int index = 0; index < size; index ++){
            extraHolder[index] = intHolder[index];
          }
        intHolder = new int[size + 10];
        for(int index = 0; index < size; index ++){
          intHolder[index] = extraHolder[index];
        }
```
- public int get( int index ) - returns value at index

- public int set( int index, int newValue ) - replaces value at index with newValue

- public void add( int index, int value) - adds value at index, shifting all elements to the right
```
public void add( int index, int value){ 
       if (size == intHolder.length){
         expand();
       }
       for(int targetIndex = size; targetIndex > index; targetIndex --){
         set(targetIndex, intHolder[targetIndex - 1]);
       }
       set(index, value);
       size ++;
     }
```

- public int remove( int index) - removes value at index, shifting all elements to the left

- private void remove(int index, int size) - supplemental method that recursively replaces each value with the value to the right of it
```
private void remove(int index, int size){
      if(index == size - 1){
        set(index, size);
      }
      else{
        remove(index, size - 1);
        set(size - 2, intHolder[size - 1]);
```
### Remarks


