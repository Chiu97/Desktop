class PeasantMultiplication{
    PeasantMultiplication(){}
    public int PeasantMultiply(int x,int y){
        if(x == 0)
            return 0;
        int x1 = x/2;
        int y1 = y + y;
        int prod = PeasantMultiply(x1,y1);
        if(x%2 == 1)
            prod += y;
        return prod;
    }
    public static void main(String args[]){
        PeasantMultiplication pm = new PeasantMultiplication();
        int res = pm.PeasantMultiply(20,21);
        System.out.print(res);
    }
}