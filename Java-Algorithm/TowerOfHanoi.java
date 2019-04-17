import java.util.*;
class TowerOfHanoi{
    TowerOfHanoi(){}
    //move all those discs from src to the des
    public void hanoi(int n,Stack<Integer> src,Stack<Integer> tmp,Stack<Integer> des){
        if(n>0){
            hanoi(n - 1,src,tmp,des);//recurse
            des.push(src.pop());//move the largest disc from src to the des
            hanoi(n - 1,tmp,des,src);//recurse , move the n - 1discs back to the src
        }
    }
    public static void main(String args[]){
        Stack<Integer> src,temp,des;
        src = new Stack<Integer>();
        temp = new Stack<Integer>();
        des = new Stack<Integer>();
        for(int i = 0 ; i < 8 ; i++)
            src.push(i);
        new TowerOfHanoi().hanoi(8,src,temp,des);
        System.out.println(src);
        System.out.println(des);
    }
}