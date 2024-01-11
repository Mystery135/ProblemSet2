public class Q4_1 {
    public static void main(String[] args) {
        myMethod(0);
    }
    public static void myMethod(int num){//Error: *No base case*
        System.out.println(num + " ");
        myMethod(num + 1);
    }
}
