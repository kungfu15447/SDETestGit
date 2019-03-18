/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author Frederik Jensen
 */
public class SortingAlgorithms
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    }
    
    private static int[] bubbleSort(int[] numbers) {
        
        Instant start = Instant.now();
        
        //O(N)
        for (int i = 1; i < numbers.length; i++)  
        {
            //O(N^2)
            for (int j = 0; j < numbers.length - 1; j++)  
            {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j]; //create temporary space
                    
                    //swap elements
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        Instant finish = Instant.now();
        
        long elapsedTime = Duration.between(start, finish).toMillis();
        
        System.out.println("Finished BubbleSort on " + numbers.length + " items in " + elapsedTime + " ms");
        
        return numbers;
    }
    
}
