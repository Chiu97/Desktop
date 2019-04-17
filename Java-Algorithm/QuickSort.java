import java.io.*;
import java.util.*;
class QS{
    QS(){}
    public void QuickSort(int[] arr,int start,int end){
        if((end - start)>=1){
            //Devide the array into three partitions
            int r = Partition(arr,start,end);
            QuickSort(arr,start,r-1);
            QuickSort(arr,r+1,end);
    }
    }
    //pivot = middle point
    public int Partition(int[] arr,int start,int end){
        int p = (end - start)/2 + start;
        Swap(arr,p,end);
        int l=start - 1;
        //swap make those elements which smaller than pivot forward
        for(int i=start;i<=end-1;i++){
            if(arr[i]<arr[end]){
                l++;
                Swap(arr,l,i);
            }
        }
        Swap(arr,l+1,end);
        System.out.println(Arrays.toString(arr));
        return (l+1);
    }
    public static void Swap(int[] arr,int i,int j){
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
    /*
    * 3,6,2,64,9
    * 2|6,9,64,3
    * 2|6,3,64,9
    * 2|6,3,9|64
    * 2|
    */
    public static void main(String args[]){
        QS qs = new QS();
        int array[] = new int[]{3,6,2,64,9};
        qs.QuickSort(array, 0, 4);
        System.out.println("Result:"+Arrays.toString(array));
    }
}