import java.util.ArrayList;
import java.util.List;

public class ListClass {

    public List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        int number;

        for (int i = 0; i < 100000; i++) {
            list.add(number = (int) (Math.random() * 10));
        }

        return list;
    }
}
