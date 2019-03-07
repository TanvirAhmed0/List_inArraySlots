# List_inArraySlots

## Tanvir Ahmed and Oliver Cai

### Fields
##### 1. int[] intHolder - Holds all the elements of our list
##### 2. int[] extraHolder - Acts a spare array to hold our elements whenever we expand
##### 3. int size - The number of elements in our list
### Constructors
##### List_inArraySlots - instantiates intHolder with 10 slots and sets size to 0
### Methods
##### int size() - returns the current size of the list
##### String toString() - returns all of the elements in the list in String form
##### boolean add() - appends a value to the end of the list
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
##### void expand() - expands intHolder to accomadate more values
```
private void expand() {
        extraHolder = new int[size];
        for(int index = 0; index < size; index ++){
            extraHolder[index] = intHolder[index];
          }
        intHolder = new int[size + 10];
        for(int index = 0; index < size; index ++){
          intHolder[index] = extraHolder[index];
        }
```
###### Remarks


