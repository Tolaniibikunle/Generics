package ibikunle.tolani;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tolaniibikunle on 2/22/17.
 */
public class SetTest {
    MySet mySet;


    @Before
    public void setUp() {
        mySet = new MySet();
    }

    @Test
    public void addTest() {
        int expected = 0;
        int actual = mySet.add();
        Assert.assertEquals("I am expecting an added element", expected, actual);


    }

    @Test
    public void removeTest() {
        int expected = 0;
        int actual = mySet.remove();
        Assert.assertEquals("i am expecting a removed element", expected, actual);

    }

    @Test
    public void containsTest() {
        boolean actual = mySet.contains();
        Assert.assertTrue(" i am expecting true", actual);

    }

    @Test
    public void getTest(){

        int expected = 5;
        int actual = mySet.size();
        Assert.assertEquals("I am expecting 5",expected,actual);

    }

}
