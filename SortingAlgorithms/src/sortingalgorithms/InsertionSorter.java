/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Frederik Jensen
 */
public class InsertionSorter
{

    public void sort(int[] a)
    {
        int n = a.length;
        for (int i = 1; i < n; i++)
        {
            int key = a[i];
            int j = i - 1;
            
            while (j >= 0 && a[j] > key)
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            
            a[j + 1] = key;
        }
    }
}
