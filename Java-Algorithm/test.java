import java.util.Arrays;

class test{
    public static void swap(int[] arr,int i,int j){
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3};
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
}