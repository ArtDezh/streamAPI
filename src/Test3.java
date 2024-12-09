import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 8, 1};

        /*Arrays.stream(arr).forEach(value -> {
            value *= 2;
            System.out.println(value);
        });*/

        //Arrays.stream(arr).forEach(System.out::println);

        //Arrays.stream(arr).forEach(Utils::myMethod);
        Arrays.stream(arr).forEach(value -> Utils.myMethod(value));
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}
