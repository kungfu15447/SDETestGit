/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

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
        MergeSorter mergesorter = new MergeSorter();
        BubbleSorter bubblesorter = new BubbleSorter(); 
        QuickSorter quicksorter = new QuickSorter();
        InsertionSorter insertionsorter = new InsertionSorter();
        
        StopWatch watch = new StopWatch();
        
        
        for (int i = 1; i <= 4; i++)
        {
            int[] mergeSortTest = generateRandomNumbers(i * 10000);
            watch.start();
            mergesorter.sort(mergeSortTest);
            watch.stop();
            System.out.println("The elapsed time for merge sorting was: " + watch.getElapsedTime() + " milliseconds");
            watch.reset();
        }
        
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        
        for (int i = 1; i <= 4; i++) {
            int[] bubbleSortTest = generateRandomNumbers(i*10000);
            watch.start();
            bubblesorter.sort(bubbleSortTest);
            watch.stop();
            System.out.println("The elapsed time for bubble sorting was: " + watch.getElapsedTime() + " milliseconds");
            watch.reset();
        }
        
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        
        for (int i = 1; i <= 4; i++) {
            int[] quickSortTester = generateRandomNumbers(i*10000);
            watch.start();
            quicksorter.sort(quickSortTester, 0, quickSortTester.length - 1);
            watch.stop();
            System.out.println("The elapsed time for quick sorting was: " + watch.getElapsedTime() + " milliseconds");
            watch.reset();
        }
        
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        
        for (int i = 1; i <= 4; i++) {
            int[] insertionSortTester = generateRandomNumbers(i*10000);
            watch.start();
            insertionsorter.sort(insertionSortTester);
            watch.stop();
            System.out.println("The elapsed time for insertion sorting was: " + watch.getElapsedTime() + " milliseconds");
            watch.reset();
        }
    }

    private static int[] generateRandomNumbers(int size)
    {
        int[] randomNumbers = new int[size];
        Random r = new Random();

        for (int i = 0; i < randomNumbers.length; i++)
        {
            randomNumbers[i] = r.nextInt(size * 10);
            //System.out.println(randomNumbers[i] + ",");
        }
        return randomNumbers;
    }

}
