import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();

        //System.out.println(result);

        // 5, 8, 2, 4, 3
        // accumulator = 5  40  80  320  960
        // element     = 8  2   4    3

        List<String> list1 = new ArrayList<>();

        list1.add("Privet");
        list1.add("Kak dela?");
        list1.add("OK");
        list1.add("poka");

        String resultStr = list1.stream().reduce((a, e) -> a + " " + e).get();

        System.out.println(resultStr);
    }
}
