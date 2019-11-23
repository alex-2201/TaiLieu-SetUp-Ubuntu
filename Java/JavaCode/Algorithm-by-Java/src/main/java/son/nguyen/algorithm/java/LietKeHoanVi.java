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
public class LietKeHoanVi {
    static void printTheArray(int arr[], int n) 
    {   
        for (int i = 1; i <= n; i++)  
        { 
            System.out.print(arr[i]+" "); 
        } 
        System.out.println(); 
    }
    
    static void Try(int arr[], boolean d[], int k, int n) {
        for(int i = 1; i<= n; i++){
            if(!d[i]) {
                arr[k] = i;
                d[i] = true;
                
                if (k == n)
                    printTheArray(arr, n);
                else 
                    Try(arr, d, k+1, n);
                d[i] = false;  
            }
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n + 1];
        boolean[] d = new boolean[n + 1];
        Try(arr, d, 1, n);
    }
}
