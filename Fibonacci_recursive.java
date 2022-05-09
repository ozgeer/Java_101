public class Fibonacci_recursive {
    static int f(int a){

        if(a==1 || a==2){
            return  1;
        }
        return f(a-1)+f(a-2);
    }
    public static void main(String[] args) {
        System.out.println(f(9));

    }
}
