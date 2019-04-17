import java.util.*;
class KthSmallest {
    public int findKthNumber(int m, int n, int k) {
        int numOfLine = 1;//定义一条斜线
        int maxDiff = m <= n ? m : n;//斜线可能所包含最大的元素数量
        int rep = m - n + 1;//最大数量斜线出现次数
        //todo 解决如何判断斜线有多少个元素
        //todo 解决判断矩阵有多少条斜线
        //proposal 1：定义一个数组去存储每个斜线的元素数量
        int difference;//定义m和n之间的差值
        int lineArr[] = new int[m+n-1];//规律得出斜线数量等于m+n-1
        int countLine = 0;
        for(int i = 0;i < m+n-1;i++){
            lineArr[i] = numOfLine;
            countLine++;
            if(countLine<maxDiff){
                numOfLine++;
            }
            if(countLine>=maxDiff+rep - 1){
                numOfLine--;
            }
        }
        System.out.println(Arrays.toString(lineArr));
        int targetLine = 0;//先确定好目标在第几条斜线
        int temp = k;//临时储存K,并且也可以计算他在斜线第几位元素
        for(int i = 0; i < m+n-1;i++){
            targetLine++;
            if(temp <= lineArr[i]){
                temp = lineArr[i] - temp;
                break;
            }
            temp -= lineArr[i];
        }
        System.out.println("targetLine:"+targetLine+"/t position:"+temp);
        if(targetLine<=m){
            int x,y;
            x = targetLine;
            y = temp/2 + 1;//要注意斜线元素的对称性

        }
        return 1;
    }
    public static void main(String args[]){
        KthSmallest solution = new KthSmallest();
        solution.findKthNumber(4, 3, 4);
    }
}