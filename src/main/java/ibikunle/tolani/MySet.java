package ibikunle.tolani;

/**
 * Created by tolaniibikunle on 2/22/17.
 */
public class MySet<T>  extends  MyArrayList {
    T[] array;
    int maxSize;
    int nextIndex;


   public void addElementToSet(T element){
        maxSize *= 2;
         T[] newArray = (T[]) new Object[maxSize];
            T temp[] = array;
            array = newArray;

            for(int i = 0;i<temp.length;i++){
                if (array[i]!=element){
                    array[i] = temp[i];
               }
           } array[nextIndex] = element;
       nextIndex++;
    }



}