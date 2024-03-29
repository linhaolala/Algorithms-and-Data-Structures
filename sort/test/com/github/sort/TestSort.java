package com.github.sort;

import com.github.util.ArrayGenerator;
import com.github.util.SortingHelper;
import org.junit.Test;

/**
 * @author lin hao
 * @create 2021/9/15
 */
public class TestSort {

    @Test
    public void selectionSortTest() throws InstantiationException, IllegalAccessException {
        Integer[] sizes = new Integer[]{10 * 1000, 100 * 1000};
        for (Integer size : sizes) {
            Integer[] array = ArrayGenerator.generateOrderedArray(size, size);
            SortingHelper.run(SelectionSort.class, array);
        }

    }

    @Test
    public void insertSortTest() throws InstantiationException, IllegalAccessException {
        Integer[] sizes = new Integer[]{10 * 1000, 100 * 1000};
        for (Integer size : sizes) {
            Integer[] array = ArrayGenerator.generateOrderedArray(size, size);
            SortingHelper.run(InsertionSort.class, array);
        }
    }

}
