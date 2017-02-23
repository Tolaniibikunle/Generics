package ibikunle.tolani;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by tolaniibikunle on 2/22/17.
 */
public class MyArrayListTest {
    MyArrayList<Integer> numbers;
    MyArrayList<String> strings;

    @Before
    public void setUp() {
        numbers = new MyArrayList<>(4);
        strings = new MyArrayList<>();
    }

    @Test
    public void addElementTest() {
        strings.addElement("Tolani");
        String expected = "Tolani";
        String actual = strings.getElement(0);
        Assert.assertEquals(" I am expecting tolani", expected, actual);
    }

    @Test
    public void removeElementTest() throws Exception {
        strings.addElement("Tolani");
        strings.removeElement(0);
        String expected = null;
        String actual = strings.getElement(0);
        Assert.assertEquals(" I am expecting null", expected, actual);

    }

    @Test
    public void containsElementTest() throws Exception{
        strings.addElement("African Prince");
        boolean actual = strings.containsElement(0);
        Assert.assertTrue(" I am expecting African Prince to print", actual);

    }

    @Test
    public void sizeTest() {
        int expected = 4;
        int actual = strings.size();
        Assert.assertEquals("I am expecting 4", expected, actual);
    }

    @Test
    public void isEmptyTest() {
        strings.addElement("Tolani");
        strings.removeElement(0);
        Assert.assertTrue("i am expecting Tolani to be removed from the array", strings.isEmpty());

    }

    @Test
    public void isClearTest() {
        strings.addElement("tolani");
        strings.removeElement(0);
        boolean actual = strings.clear();
        Assert.assertTrue("I am expecting a clear array", actual);

    }

    @Test
    public void setTest() {
        strings.addElement("Tolani");
        strings.set(1, "David");
        String expected = "David";
        String actual = strings.getElement(1);
        Assert.assertEquals("I am expecting David", expected, actual);

    }

    @Test
    public void getTest() {
        strings.addElement("tolani");
        String expected = "tolani";
        String actual = strings.getElement(0);
        Assert.assertEquals("i am expecting a five", expected, actual);
    }
}

