import java.io.*;
import java.util.*;

import jdk.internal.jline.internal.InputStreamReader;
//  0   1   1   2   3   5   8
class FiboAdvanced{
    int num = 0;
    int fiboList[];
    FiboAdvanced(int num){
        this.num=num;
        if(num>1){
            fiboList = new int[num];
            for(int i = 0;i < num;i++){
                fiboList[i] = -1;
            }
        }
    }
    public int solution(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else{
            if(fiboList[n-1] == -1)
                fiboList[n-1] = solution(n-1) + solution(n-2);
        }
        return fiboList[n-1];
    }
    public static void main(String[] args) {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.println("请输入要查找的位置(从0开始):");
        str = br.readLine();
        int pos = Integer.parseInt(str);
        FiboAdvanced fa = new FiboAdvanced(pos);
        int res = fa.solution(pos);
        System.out.println("该位置的数值为:"+res);
    }
}