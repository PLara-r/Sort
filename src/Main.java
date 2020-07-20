import java.util.Comparator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::println); // bear-brown-

        Stream<String> s1 = Stream.of("brown bear-", "grizzly-");
        s1.sorted(Comparator.reverseOrder())
                .forEach(System.out::println); // grizzly-brown bear-

        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list.stream().filter(n -> n.length() == 4).sorted()
                .limit(2).forEach(System.out::println);

           List<String> cats = new ArrayList<>();
           cats.add("Annie");
           cats.add("Ripley");
           Stream<String> stream = cats.stream();
           cats.add("KC");
           System.out.println(stream.count());

        Stream<String> b = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        b.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); // [f, l, o, w]
        //Если бы нам не нужно было сортировать набор, мы могли бы сделать код еще короче:
        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        Set<String> set1 = stream3.collect(Collectors.toSet());
        System.out.println(set1); // [f, w, l, o]




    }
}
