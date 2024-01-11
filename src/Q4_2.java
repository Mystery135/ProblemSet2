public class Q4_2 {
    public static void main(String[] args) {
        System.out.println(sumBetween(new int[]{10, -2, 4, 5, 1, 2}, 0, 5));
    }
    public static int sumBetween(int[] ints, int start, int end){
        if (start == end){
            return ints[start];
        }
        return ints[start] + sumBetween(ints, start + 1, end);
    }
}
