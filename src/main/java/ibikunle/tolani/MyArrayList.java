package ibikunle.tolani;

/**
 * Created by tolaniibikunle on 2/22/17.
 */
public class MyArrayList<T> {
    int maxSize ;
    int nextIndex;
    T[] array;

    public MyArrayList() {
        array = (T[]) new Object[8]; // setting the initial size of the array to 8;
        this.maxSize = 8;
    }

    public MyArrayList(int startingSize) {
        array = (T[]) new Object[startingSize]; //setting the initial size of the array to be the int starting size;
        this.maxSize = startingSize;
    }

    public void addElement(T element) {
        maxSize *= 2; // this will double the maxSize, essentially resize the array
        T[] newArray = (T[]) new Object[maxSize]; //creating a new array which is equal to the maxSize which is the array size doubled
        T temp[] = array;  // setting the temporary array t
        array =  newArray; //setting the new array to the value at array
        for (int i = 0; i < temp.length; i++) { //iterating through the temporary array
            array[i] = temp[i];// setting the elements in the temporary array to the indices in the new array;
        }
        array[nextIndex] = element; // setting the item I am passing through to the element at the next index;
        nextIndex++;
    }

    public T getElement(int element){
        return array[element];
    }


    public void removeElement(int indexToRemove) {
        T temp[] = array; // storing the array into a temporary array
        array = (T[]) new Object[array.length]; // initializing array to the length of New array
        for (int i = 0; i < array.length; i++) {  //iterating through the  array;
            if (i != indexToRemove) { // if i is not equal to element you want to remove
                array[i] = temp[i]; // add that all the other elements to the array except the index to remove
            }
        }



    }

    public int size() {
        return array.length;
    }

    public void set(int index,T element) {
        array = (T[]) new Object[maxSize];// i don't believe this is necessary
        array[index] = element;// setting the value at that index;

    }

    public boolean containsElement(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element));
                return true;
        }
        return false;
    }

    public boolean isEmpty() {
        for (int i = 0; i <array.length ; i++) {
            if (array[i]!= null) {
                return false;
            }
        }
        return true;
    }


    public boolean clear() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                return false;
        }

        return true;
    }
}