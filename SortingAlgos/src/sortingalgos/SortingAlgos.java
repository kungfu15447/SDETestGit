/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgos;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

/**
 *
 * @author Frederik Jensen
 */
public class SortingAlgos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int size = 40000;
        int[] randomNumbers = new int[size];
        Random r = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = r.nextInt(size*10);
            System.out.print(randomNumbers[i] + ", ");
        }
        
        System.out.println();
        
        int[] sortedSomething = bubbleSort(randomNumbers);
        for (int i = 0; i < sortedSomething.length; i++) {
            System.out.print(sortedSomething[i] + ", ");
        }
    }
    
    private static int[] bubbleSort(int[] numbers) {
        Instant start = Instant.now();
        for (int i = 1; i < numbers.length; i++) //O(N)
        {
            for (int j = 0; j < numbers.length - 1; j++) //O(N^2) 
            {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        Instant finish = Instant.now();
        long elapsedTime = Duration.between(start, finish).toMillis();
        System.out.println("Elapes time: " + elapsedTime);
        return numbers;
    }
    
}
