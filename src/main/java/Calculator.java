public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(int a,int b,int c,int d){
        return add(times(a,dif(b,c)),d);//(3*(5-2))+10
    }
}
