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
    public int solver(int a, int b){
        return times(add(a,b),add(a,b));
        return add(times(a, a),add( 2*times(a,b), times(b,b)) ;

    }
}