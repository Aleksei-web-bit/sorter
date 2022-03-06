import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    public static List<Integer> create() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }

        return list;
    }
}
