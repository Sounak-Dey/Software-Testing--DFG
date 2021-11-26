import org.junit.Test;;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {
    Main obj=new Main();

    @Test
    public void selectionSort() {
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(87));
        // For 1-9 du path, variable n
        assertArrayEquals(arr.toArray(),obj.SelectionSort(arr).toArray());

        ArrayList<Integer> exp1 = new ArrayList<Integer>(
                Arrays.asList(1,2));
        ArrayList<Integer> act1 = new ArrayList<Integer>(
                Arrays.asList(2,1));
        // For 1-2-3-4-5-6-74-8-2-9 du path, variable min_idx
        assertArrayEquals(exp1.toArray(),obj.SelectionSort(act1).toArray());
    }

    @Test
    public void bubbleSort() {
        ArrayList<Integer> exp1 = new ArrayList<Integer>(
                Arrays.asList(87));
        ArrayList<Integer> act1 = new ArrayList<Integer>(
                Arrays.asList(87));
        // For 0-1-7 du path, variable n
        assertArrayEquals(exp1.toArray(),obj.BubbleSort(act1).toArray());

        ArrayList<Integer> exp2 = new ArrayList<Integer>(
                Arrays.asList(1,2));
        ArrayList<Integer> act2 = new ArrayList<Integer>(
                Arrays.asList(1,2));
        // For 0-1-2-3-5-6-1-7 du path, variable n, j and i
        assertArrayEquals(exp2.toArray(),obj.BubbleSort(act2).toArray());

        ArrayList<Integer> exp3 = new ArrayList<Integer>(
                Arrays.asList(1,2));
        ArrayList<Integer> act3 = new ArrayList<Integer>(
                Arrays.asList(2,1));
        // For 0-1-2-3-4-5-6-1-7 du path, variable i and j
        assertArrayEquals(exp3.toArray(),obj.BubbleSort(act3).toArray());

        ArrayList<Integer> exp4 = new ArrayList<Integer>(
                Arrays.asList(1,2,3));
        ArrayList<Integer> act4 = new ArrayList<Integer>(
                Arrays.asList(1,2,3));
        // For 0-1-2-3-5-2-3-5-6-1-7 du path, variable j
        assertArrayEquals(exp4.toArray(),obj.BubbleSort(act4).toArray());

        ArrayList<Integer> exp5 = new ArrayList<Integer>(
                Arrays.asList(1,2,3));
        ArrayList<Integer> act5 = new ArrayList<Integer>(
                Arrays.asList(2,1,3));
        // For 0-1-2-3-4-5-6-1-2-3-5-6-1-7 du path, variable j
        assertArrayEquals(exp5.toArray(),obj.BubbleSort(act5).toArray());

        ArrayList<Integer> exp6 = new ArrayList<Integer>(
                Arrays.asList(1,2,3));
        ArrayList<Integer> act6 = new ArrayList<Integer>(
                Arrays.asList(2,3,1));
        // For 0-1-2-3-4-5-6-1-2-3-4-5-6-1-7 du path, variable temp
        assertArrayEquals(exp6.toArray(),obj.BubbleSort(act6).toArray());

    }

    @Test
    public void insertionsort() {
        ArrayList<Integer> exp1 = new ArrayList<Integer>(
                Arrays.asList(87));
        ArrayList<Integer> act1 = new ArrayList<Integer>(
                Arrays.asList(87));
        // For 1-2-7 du path, variable n
        assertArrayEquals(exp1.toArray(),obj.Insertionsort(act1).toArray());

        ArrayList<Integer> exp2 = new ArrayList<Integer>(
                Arrays.asList(1,2));
        ArrayList<Integer> act2 = new ArrayList<Integer>(
                Arrays.asList(1,2));
        // For 1-2-3-4-6-2-7 du path, variable i and key
        assertArrayEquals(exp2.toArray(),obj.Insertionsort(act2).toArray());

        ArrayList<Integer> exp3 = new ArrayList<Integer>(
                Arrays.asList(1,2));
        ArrayList<Integer> act3 = new ArrayList<Integer>(
                Arrays.asList(2,1));
        // For 1-2-3-4-5-4-6-2-7 du path, variable j
        assertArrayEquals(exp3.toArray(),obj.Insertionsort(act3).toArray());
    }

    @Test
    public void binarySearch() {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(
                Arrays.asList());
        // For 1-2-9 du path, variable l and r
        assertEquals(-1,obj.binarySearch(arr1,9));

        ArrayList<Integer> arr2 = new ArrayList<Integer>(
                Arrays.asList(7));
        // For 1-2-3-4-5-10 du path, variable l, m and x
        assertEquals(0,obj.binarySearch(arr2,7));

        ArrayList<Integer> arr3 = new ArrayList<Integer>(
                Arrays.asList(7));
        // For 1-2-3-4-6-7-2-9 du path, variable l,m and x
        assertEquals(-1,obj.binarySearch(arr3,8));

        ArrayList<Integer> arr4 = new ArrayList<Integer>(
                Arrays.asList(1,2,3));
        // For 1-2-3-4-6-7-2-3-4-5-10 du path, variable l
        assertEquals(0,obj.binarySearch(arr4,1));

        ArrayList<Integer> arr5 = new ArrayList<Integer>(
                Arrays.asList(7));
        // For 1-2--3-4-6-8-2-9 du path, variable r and m
        assertEquals(-1,obj.binarySearch(arr5,6));

        ArrayList<Integer> arr6 = new ArrayList<Integer>(
                Arrays.asList(1,2,3));
        // For 1-2--3-4-6-8-2-3-4-6-8-2-9 du path, variable r
        assertEquals(-1,obj.binarySearch(arr6,0));

        ArrayList<Integer> arr7 = new ArrayList<Integer>(
                Arrays.asList(3,4,10));
        // For 1-2-3-4-5-10 du path, variable m and x
        assertEquals(1,obj.binarySearch(arr7,4));
    }

    @Test
    public void power() {
        // For 1-2-3-5-6-2-7 du path, variable x and y
        assertEquals(2,obj.power(2,1));

        // For 1-2-3-4-6-2-3-5-6-2-7 du path, variable x and y
        assertEquals(4,obj.power(2,2));

        // For 1-2-7 du path, variable result
        assertEquals(1,obj.power(2,0));
    }

    @Test
    public void getInvCount() {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(
                Arrays.asList(87));
        // For 1-2-8 du path, variable n
        assertEquals(0,obj.getInvCount(arr1,arr1.size()));

        ArrayList<Integer> arr2 = new ArrayList<Integer>(
                Arrays.asList(2,1));
        // For 1-2-3-4-5-6-3-7-2-8 du path, variable invcount
        assertEquals(1,obj.getInvCount(arr2,arr2.size()));
    }
}