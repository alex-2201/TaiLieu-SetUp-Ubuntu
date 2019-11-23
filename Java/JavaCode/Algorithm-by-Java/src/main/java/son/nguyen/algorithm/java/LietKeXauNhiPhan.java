/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

/**
 *
 * @author thena
 */
public class LietKeXauNhiPhan {
    static void printTheArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++)  
        { 
            System.out.print(arr[i]+" "); 
        } 
        System.out.println(); 
    } 

    static void generateAllBinaryStrings(int n, int arr[], int i) 
    { 
        if (i == n)  
        { 
            printTheArray(arr, n); 
            return; 
        } 

        arr[i] = 0; 
        generateAllBinaryStrings(n, arr, i + 1); 

        arr[i] = 1; 
        generateAllBinaryStrings(n, arr, i + 1); 
    }
    
    public static void main(String args[]) 
    { 
        int n = 4; 
        int[] arr = new int[n]; 
        generateAllBinaryStrings(n, arr, 0); 
    } 
}

