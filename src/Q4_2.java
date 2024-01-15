public class Q4_2 {
    public static void main(String[] args) {
        System.out.println(sumBetween(new int[]{10, -2, 4, 5, 1, 2}, 0, 5));//test case
    }
    public static int sumBetween(int[] ints, int start, int end){
        if (start == end){//If start = end, then the program has gone through all numbers between start & end.
            return ints[end];//Returns the number at index end.
        }
        return ints[start] + sumBetween(ints, start + 1, end);//Adds the number at index start to the other numbers between index start and end
    }
}
