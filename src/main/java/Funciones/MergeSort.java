/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funciones;

public class MergeSort {
    
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Si el arreglo está vacío o tiene un solo elemento, ya está ordenado
        }
        int[] helper = new int[arr.length]; // Arreglo auxiliar para el proceso de fusión
        mergeSort(arr, helper, 0, arr.length - 1); // Llamada al método auxiliar de ordenamiento
    }

    private static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, helper, low, mid); // Ordenar la mitad izquierda
            mergeSort(arr, helper, mid + 1, high); // Ordenar la mitad derecha
            merge(arr, helper, low, mid, high); // Fusionar las dos mitades ordenadas
        }
    }

    private static void merge(int[] arr, int[] helper, int low, int mid, int high) {
        // Copiar el contenido de arr en helper
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }

        int left = low;
        int right = mid + 1;
        int current = low;

        // Fusionar las dos mitades ordenadas de helper en arr
        while (left <= mid && right <= high) {
            if (helper[left] <= helper[right]) {
                arr[current] = helper[left];
                left++;
            } else {
                arr[current] = helper[right];
                right++;
            }
            current++;
        }

        // Copiar los elementos restantes de la mitad izquierda (si hay)
        int remaining = mid - left;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helper[left + i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 1, 5, 4};
        System.out.println("Arreglo original:");
        printArray(arr);
        
        mergeSort(arr);
        
        System.out.println("Arreglo ordenado:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
