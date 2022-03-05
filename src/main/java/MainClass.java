import java.util.Arrays;
import java.util.Collections;

public class MainClass {

    public static void main(String[] args) {
        ArrayClass arrayClass = new ArrayClass();
        ListClass listClass = new ListClass();

        long start;
        long timeWorkCode;

        start = System.currentTimeMillis();
        BubbleSorter.sort(arrayClass.getArray());
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки массива по алгоритму BubbleSorter: " + timeWorkCode + " миллисекунд");

        start = System.currentTimeMillis();
        SelectionSorter.sort(arrayClass.getArray());
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки массива по алгоритму SelectionSorter: " + timeWorkCode + " миллисекунд");

        start = System.currentTimeMillis();
        Arrays.sort(arrayClass.getArray());
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки массива с помощью стандартного метода Arrays.sort: " + timeWorkCode + " миллисекунд");

        start = System.currentTimeMillis();
        BubbleSorter.bubbleSortArrayList(listClass.getList());
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки списка по алгоритму BubbleSorter: " + timeWorkCode + " миллисекунд");

        start = System.currentTimeMillis();
        SelectionSorter.selectionSortArrayList(listClass.getList());
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки списка по алгоритму SelectionSorter: " + timeWorkCode + " миллисекунд");

        start = System.currentTimeMillis();
        Collections.sort(listClass.getList());
        timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время сортировки списка с помощью стандартного метода Collections.sort: " + timeWorkCode + " миллисекунд");
    }
}
