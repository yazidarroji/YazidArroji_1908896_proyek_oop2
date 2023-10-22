/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stopwatch;
import java.util.Random;
/**
 *
 * @author yazidarroji
 */

public class StopWatch {
    private long startTime;
    private long endTime;
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }

        StopWatch sw = new StopWatch();
        selectionSort(arr);
        sw.stop();

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nElapsed Time: " + sw.getElapsedTime() + " mili detik");
    }
    
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }

 
}

