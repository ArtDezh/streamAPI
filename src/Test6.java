import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        int result = Arrays.stream(arr).filter(e -> e % 2 == 1).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((a, e) -> a + e).getAsInt();

        System.out.println(result);

        // 3  1  5  9  21  81  7
        // 1  1  5  3  7   27  7
        // 51 - ответ

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikoplay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students.stream().map(x -> {
            x.setName(x.getName().toUpperCase());
            return x;
        }).filter(x -> x.getSex() == 'f').sorted((x, y) -> x.getAge() - y.getAge()).forEach(x -> System.out.println(x));

    }

}
