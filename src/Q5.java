import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        System.out.println(maxElement(new int[]{1, 5, 1, 8, 9, 2, -9999}));
    }
    public static int maxElement(int[] ints){
        if (ints.length == 1){return ints[0];}
        if (ints[0] <= ints[1]){
            ints = Arrays.copyOfRange(ints, 1, ints.length);
            System.out.println(Arrays.toString(ints));
        }else{
            int temp = ints[0];
            ints = Arrays.copyOfRange(ints, 1, ints.length);
            ints[0] = temp;
        }
        return maxElement(ints);

        }
}
