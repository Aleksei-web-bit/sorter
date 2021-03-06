import java.util.List;

public class SelectionSort {

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }

    public static void sortArrayList(List<Integer> list) {
        int smallInt = 0;
        int j = 0;
        int smallIntIndex = 0;

        for (int i = 1; i < list.size(); i++) {

            smallInt = list.get(i - 1);
            smallIntIndex = i - 1;

            for (j = i; j < list.size(); j++) {
                if (list.get(j) < smallInt) {
                    smallInt = list.get(j);
                    smallIntIndex = j;
                }
            }

            int temp = list.get(smallIntIndex);
            list.set(smallIntIndex, list.get(i - 1));
            list.set(i - 1, temp);
        }
    }
}
