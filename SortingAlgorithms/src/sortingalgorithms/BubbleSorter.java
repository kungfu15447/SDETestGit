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
public class BubbleSorter
{

    public void sort(int[] numbers)
    {

        //O(N)
        for (int i = 1; i < numbers.length; i++)
        {
            //O(N^2)
            for (int j = 0; j < numbers.length - 1; j++)
            {
                if (numbers[j] > numbers[j + 1])
                {
                    int temp = numbers[j]; //create temporary space

                    //swap elements
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
