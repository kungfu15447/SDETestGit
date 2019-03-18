package sortingalgorithms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frederik Jensen
 */
public class MergeSorter
{
    public void sort(int[] a) {
        if (a.length <= 1) {
            return;
        }
        int[] first = new int[a.length/2];
        int[] second = new int[a.length - first.length];
        for (int i = 0; i < first.length; i++) {
            first[i] = a[i];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = a[first.length + i];
        }
        sort(first);
        sort(second);
        merge(first, second, a);
    }
    private void merge(int[] first, int[] second, int[] a) {
        int firstValue = 0;
        int secondValue = 0;
        int aPosition = 0;
        
        while(firstValue < first.length && secondValue < second.length) {
            if (first[firstValue] < second[secondValue]) {
                a[aPosition] = first[firstValue];
                firstValue++;
            } else {
                a[aPosition] = second[secondValue];
                secondValue++;
            }
            aPosition++;
        }
        
        while(firstValue < first.length) {
            a[aPosition] = first[firstValue];
            firstValue++;
            aPosition++;
        }
        
        while(secondValue < second.length) {
            a[aPosition] = second[secondValue];
            secondValue++;
            aPosition++;
        }
    }
}
