package jsd.core.sorting.arrays;

/**
 * @author R.Arya
 * @version $Id$
 * @since 0.7.5
 */
public class BubbleArraySorter<T extends Comparable<T>> {

    public void sort(T[] arrayToBeSorted) {
        T tempObject;
        for (int i = 0; i < arrayToBeSorted.length; i++) {
            for (int j = 0; j < arrayToBeSorted.length; j++) {
                if (arrayToBeSorted[j].compareTo(arrayToBeSorted[j + 1]) == 1) {
                    tempObject = arrayToBeSorted[j];
                    arrayToBeSorted[j] = arrayToBeSorted[j + 1];
                    arrayToBeSorted[j + 1] = tempObject;
                }
            }
        }
    }
}
