/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.Arrays;

/**
 *
 * @author Frederik Jensen
 */
public class QuickSorter
{
    public void sort(int[] a, int from, int to) {
        if (from < to) {
            int partitionIndex = partition(a, from, to);
            sort(a, from, partitionIndex - 1);
            sort(a, partitionIndex + 1, to);
        }
        
    }
    
    private int partition(int[] a, int from, int to) {
        int pivot = a[from];
        int i = from - 1;
        int j = to + 1;
        
        while (i < j) {
            i++;
            while (a[i] < pivot) {
                i++;
            }
            j--;
            while(a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int tempValue = a[i];
                a[i] = a[j];
                a[j] = tempValue;
            }
        }
        return j;
    }
}
