public class ArrayUtil {

    public static int[] create() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        return arr;
    }
}
