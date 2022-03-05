public class ArrayClass {

    public int[] getArray() {
        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        return arr;
    }
}
