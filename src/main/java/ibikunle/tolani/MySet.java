package ibikunle.tolani;

/**
 * Created by tolaniibikunle on 2/22/17.
 */
public class MySet<T> {
    T [] array;
    int maxSize;
    int nextIndex;



    public void add(T element){
        maxSize *= 2;
            T[] newArray = (T[]) new Object[maxSize];
            T temp[] = array;
            array = (T[]) newArray[maxSize];

            for(int i = 0;i<temp.length;i++){
                if (array[i]!=element){
                    array[i] = temp[i];
                }
            } array[nextIndex] = element;
        nextIndex++;
    }

    public void remove(int  element) {
        T temp[] = array;
        array = (T[]) new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i != element) {
                array[i] = temp[i];
            }

        }
    }
    public T getElement(int element){
        array = (T[]) new Object[maxSize];
        return array[element];
    }

    public boolean contains(T element){
        array = (T[]) new Object[maxSize];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return true;
        }
        return false;
    }

    public int size() {
        return array.length;
    }

    }

