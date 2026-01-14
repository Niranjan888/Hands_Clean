package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStreamApi {
    public static void main(String[] args) {
        List<Number> list = Arrays.asList(43, 42, 62, 129);
        String[] strings = { "aman", "suvam", null,
                "sahil", null };

//        System.out.println(list.stream());
//        System.out.println(list.parallelStream());
//        System.out.println(Stream.of(1, 2, 3));
//        System.out.println(Stream.generate(Math::random).limit(5));
//        Stream.generate(Math::random).limit(5).toList();
//        Creates a stream from array.
//        int[] arr = new int[10];
//        Arrays.stream(arr);

//        list.stream().sorted(Comparator.nullsLast(Comparator.reverseOrder());
//        List<String> myList = Arrays.stream(strings).sorted(Comparator.nullsLast(Comparator.reverseOrder())).toList();
        List<String> myList = Arrays.stream(strings).sorted(Comparator.nullsLast(Comparator.reverseOrder())).toList();
//        List<String> myList1 = Arrays.stream(strings).sorted(Comparator.comparing(x -> x)).toList();
        String[] array = { "GFG", "Geeks", "FOR", "GeeksforGeeks", "GeeksQuiz" };
        Stream.of(array)
                .sorted(Comparator.comparing(str -> str.charAt(str.length() - 1)))
                .forEach(System.out::println);


//        System.out.println(myList1);
//        System.out.println(strings.);
    }
}
