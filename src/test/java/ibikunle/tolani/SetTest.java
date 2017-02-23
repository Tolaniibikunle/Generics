package ibikunle.tolani;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tolaniibikunle on 2/22/17.
 */
public class SetTest {
    MySet<String> mySet;


    @Before
    public void setUp() {
        mySet = new MySet<>();
    }

    @Test
    public void addTest() throws Exception{
        mySet.add("Tolani");
        String expected = "Tolani";
        String actual = mySet.getElement(0);
        Assert.assertEquals("I am expecting",expected,actual);
    }

    @Test
    public void removeTest() throws Exception{
        mySet.add("Tolani");
        mySet.remove(0);
        String expected = null;
        String actual = mySet.getElement(0);
        Assert.assertEquals("i am expecting a removed element", expected, actual);

    }
    @Test
    public void containsTest() throws Exception{
        mySet.add("tolani");
        boolean actual = mySet.contains("tolani");
        Assert.assertTrue("I am expecting true",actual);


    }

    @Test
    public void getTest()throws Exception{
        mySet.add("Tolani");
        String expected = "Tolani";
        String actual = mySet.getElement(0);
        Assert.assertEquals("I am expecting",expected,actual);

    }

}
