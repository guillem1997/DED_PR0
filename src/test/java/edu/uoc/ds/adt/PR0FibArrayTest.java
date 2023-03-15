package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class PR0FibArrayTest {
    PR0FibArray pr0Array;

    @Before
    public void setUp() {
        this.pr0Array = new PR0FibArray();

        assertNotNull(this.pr0Array.getArray());
    }

    @After
    public void release() {
        this.pr0Array = null;
    }

    @org.junit.Test
    public void arrayTest() {
        int[] v = this.pr0Array.getArray();
        assertEquals(0, v[0]);
        assertEquals(1, v[1]);
        assertEquals(1, v[2]);
        assertEquals(2, v[3]);
        assertEquals(3, v[4]);
        assertEquals(5, v[5]);
        assertEquals(8, v[6]);
        assertEquals(13, v[7]);
        assertEquals(21, v[8]);
        assertEquals(34, v[9]);
        assertEquals(55, v[10]);
        assertEquals(89, v[11]);
        assertEquals(144, v[12]);
        assertEquals(233, v[13]);
        assertEquals(377, v[14]);
        assertEquals(610, v[15]);
        assertEquals(987, v[16]);
        assertEquals(1597, v[17]);
        assertEquals(2584, v[18]);
        assertEquals(4181, v[19]);
    }
    @org.junit.Test
    public void searchArray() {
        int index = this.pr0Array.getIndexOf(4);
        assertEquals(-1, index);
        index = this.pr0Array.getIndexOf(21);
        assertEquals(8, index);
        index = this.pr0Array.getIndexOf(4181);
        assertEquals(19, index);
    }
    @org.junit.Test
    public void binarySearchArray() {
        int index = this.pr0Array.binarySearch(41);
        assertEquals(-1, index);
        index = this.pr0Array.binarySearch(8);
        assertEquals(6, index);
    }
}
