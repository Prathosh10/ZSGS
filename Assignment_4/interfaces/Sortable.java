package interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public interface Sortable {
    public void sort(int[] arr);
}

class BubbleSort implements Sortable{
    @Override
    public void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            boolean check = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }

            if (!check) {
                break;
            }
        }
    }
}

class QuickSort implements Sortable{
    @Override
    public void sort(int[] arr) {
        int size = arr.length;
        quickSort(arr, 0, size - 1);
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}

class MergeSort implements Sortable{
    @Override
    public void sort(int[] arr) {
        int size = arr.length;
        mergeSort(arr, 0, size - 1);
    }

    public void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public void merge (int[] arr, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();

        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= end) {
            temp.add(arr[right++]);
        }

        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }
    }
}

class SortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements : ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("give numbers : ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Array : " + Arrays.toString(arr));
        System.out.println("Select Sort method : \n 1.Bubble sort \n 2. Quick sort \n 3. Merge sort \n 0. exit" );
        int option = sc.nextInt();
        switch (option) {
            case 1 :
                Sortable bs = new BubbleSort();
                bs.sort(arr);
                System.out.println("Sorted happen successfully!");
                break;
            case 2 :
                Sortable qs = new QuickSort();
                qs.sort(arr);
                System.out.println("Sorted happen successfully!");
                break;
            case 3 :
                Sortable ms = new MergeSort();
                ms.sort(arr);
                System.out.println("Sorted happen successfully!");
                break;
            case 0 :
                System.out.println("No Sorting happens!");
                break;
        }
        System.out.println("After sort : " + Arrays.toString(arr));

    }
}
