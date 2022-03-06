import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        long start;
        long timeWorkCode;

        int[] arr1 = ArrayUtil.create();
        System.out.println("Массив до сортировки: " + Arrays.toString(arr1));
        start = System.currentTimeMillis();
        BubbleSort.sortArray(arr1);
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки массива по алгоритму BubbleSort: " + timeWorkCode + " миллисекунд");
        System.out.println("Отсортированный массив: " + Arrays.toString(arr1));

        int[] arr2 = ArrayUtil.create();
        System.out.println("Массив до сортировки: " + Arrays.toString(arr2));
        start = System.currentTimeMillis();
        SelectionSort.sortArray(arr2);
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки массива по алгоритму SelectionSort: " + timeWorkCode + " миллисекунд");
        System.out.println("Отсортированный массив: " + Arrays.toString(arr2));

        int[] arr3 = ArrayUtil.create();
        System.out.println("Массив до сортировки: " + Arrays.toString(arr3));
        start = System.currentTimeMillis();
        Arrays.sort(arr3);
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки массива с помощью стандартного метода Arrays.sort: " + timeWorkCode + " миллисекунд");
        System.out.println("Отсортированный массив: " + Arrays.toString(arr3));

        List<Integer> list1 = ListUtil.create();
        System.out.println("Список до сортировки: " + list1);
        start = System.currentTimeMillis();
        BubbleSort.sortArrayList(list1);
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки списка по алгоритму BubbleSort: " + timeWorkCode + " миллисекунд");
        System.out.println("Отсортированный список: " + list1);

        List<Integer> list2 = ListUtil.create();
        System.out.println("Список до сортировки: " + list2);
        start = System.currentTimeMillis();
        SelectionSort.sortArrayList(list2);
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки списка по алгоритму SelectionSort: " + timeWorkCode + " миллисекунд");
        System.out.println("Отсортированный список: " + list2);

        List<Integer> list3 = ListUtil.create();
        System.out.println("Список до сортировки: " + list3);
        start = System.currentTimeMillis();
        Collections.sort(list3);
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки списка с помощью стандартного метода Collections.sort: " + timeWorkCode + " миллисекунд");
        System.out.println("Отсортированный список: " + list3);
    }
}
