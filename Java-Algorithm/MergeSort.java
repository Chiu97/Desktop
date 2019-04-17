import java.io.*;
import java.util.*;

//TODO algorithm implementation
public class MergeSort{
    MergeSort(){}
    public void sort(int[] ar){
        int m = ar.length/2;
        sort(Arrays.copyOfRange(ar, 0, m+1));
        sort(Arrays.copyOfRange(ar, m+1, ar.length));
        merge(ar,m);
    }
    public void merge(int[] arr,int m){
        int i = 1;
        int j = m+1;
        int newArr[] = new int[arr.length];
        for(int k = 1;k < arr.length;k++){
            if(j>arr.length){
                newArr[k] = arr[i];
                i++;
            }
            else if(i > m){
                newArr[k] = arr[j];
                j++;
            }
            else if(arr[i] < arr[j]){
                newArr[k] = arr[i];
                i++;
            }
            else if(arr[i] > arr[j]){
                newArr[k] = arr[j];
                j++;
            }
        }
        for(int k = 0;k < arr.length;k++){
            arr[k] = newArr[k];
        }
    }
    public static void main(String args[]){
        MergeSort ms = new MergeSort();
        int[] test = new int[]{5,4,2,3,1};
        ms.sort(test);
    }
}
