import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        System.out.println(maxElement(new int[]{1, 5, 1, 8, 9, 2, -9999}));
        System.out.println(maxElement(new int[]{1, 5, 1, 8, 9, 2, -9999}, 0, 0));//test cases
    }


    //With 1 parameter (modifies the array)
    public static int maxElement(int[] ints){
        if (ints.length == 1){return ints[0];}//If there is only one item in the array, that is the max num.

        //Creates an array with a length of 1 item shorter than the current array. The item removed is the smaller of ints[0] and ints[1].
        if (ints[0] <= ints[1]){
            ints = Arrays.copyOfRange(ints, 1, ints.length);
        }else{
            int temp = ints[0];
            ints = Arrays.copyOfRange(ints, 1, ints.length);
            ints[0] = temp;
        }
        return maxElement(ints);
        }

    //With 3 parameters (doesn't modify the array)
    public static int maxElement(int[] ints, int from, int currentMax){
        if (from == ints.length-1){//If from = ints.length-1, the method has gone through all the numbers in the array.
            return currentMax;
        }
        if (ints[from] > currentMax){//Replaces the current max number with the number at the current index if it's bigger than the current max number.
            currentMax = ints[from];
        }
        return maxElement(ints, from+1, currentMax);//Adds 1 to from and calls itself.
    }


}
