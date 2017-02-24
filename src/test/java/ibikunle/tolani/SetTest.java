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
    public void addElementToSetTest() throws Exception {
        mySet.addElement("Tolani");
        String expected = "Tolani";
        String actual = (String) mySet.getElement(0);
        Assert.assertEquals(" I am expecting tolani", expected, actual);
    }

}
