package ibikunle.tolani;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by tolaniibikunle on 2/22/17.
 */
public class MyArrayListTest<T> {
    MyArrayList myArrayList;
    T[] arr;

    @Before
    public void setUp() {
        myArrayList = new MyArrayList();
        arr = (T[]) new Object[1, 2, 3, 4];
    }

    @Test
    public void addElementTest() {
        int expected = 5;
        int actual = (int) myArrayList.addElement();
        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void removeElementTest() {
        int expected = 4;
        int actual = myArrayList.removeElement();
        Assert.assertEquals("", expected, actual);


    }

    @Test
    public void containsElementTest() {
        Object object = new Object();
        boolean actual = myArrayList.containsElement(object);
        Assert.assertTrue("i am expecting true", actual);
    }

    @Test
    public void sizeTest() {
        int expected = 8;
        int actual = myArrayList.size();
        Assert.assertEquals("I am expecting 8", expected, actual);
    }

    @Test
    public void isEmptyTest() {
        boolean actual = myArrayList.isEmpty();
        Assert.assertTrue("I am expecting true", actual);

    }

    @Test
    public void isClearTest() {
        boolean actual = myArrayList.clear();
        Assert.assertEquals("i am expecting true", actual);
    }

    @Test
    public void getTest() {
        int expected = 5;
        int actual = (int) myArrayList.getElement(5);
        Assert.assertEquals("i am expecting a five", expected, actual);
    }
}

