package jsd.core.sorting.arrays;

import jsd.core.tree.ITree;
import jsd.core.tree.binarysearchtree.BinarySearchTree;
import jsd.core.tree.binarysearchtree.InOrderTreeTraverser;

public class TreeArraySorter<T extends Comparable<T>> implements ISorter {

    public void sort(T[] arrayToBeSorted) {
        ITree<T> tree = new BinarySearchTree<T>();
        for (T element : arrayToBeSorted) {
            tree.addElement(element);
        }
        tree.traverseTree(new InOrderTreeTraverser<T>());
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeArraySorter<Integer> treeArraySorter = new TreeArraySorter<Integer>();
        Integer[] arrayToBeSorted = {2, 8, 9, 6, 7, 4, 1};
        treeArraySorter.sort(arrayToBeSorted);
        // TreeArraySorter<String> treeArraySorter = new TreeArraySorter<String>();
        // String[] arrayToBeSorted = {"Rohan", "Sahil", "Muumy","Papa","Sakshi"};
        // treeArraySorter.sort(arrayToBeSorted);
    }

}
