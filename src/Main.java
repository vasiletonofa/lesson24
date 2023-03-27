import person.Gheorghe;
import person.Ion;
import person.Person;
import shape.Shape;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("Hello");
        list.add("World");
        list.add("people");


//       List<String> list2 =      Arrays.asList("Hello", "World").stream()
//                .filter(s -> s.length() == 5) // Intermediate operation  abc Hello  people
//                .map(s -> s.toUpperCase()) // Intermediate operation   HELLO  WORLD  PEOPLE
//                .limit(2) // HELLO WORLD  PEOPLE
//                .sorted() // HELLO  WORLD
//                .peek( s -> System.out.println(s)) //HELLO  WORLD
//                .collect(Collectors.toList());  // Terminal operation  => HashSet  HELLO WORLD
//
//
//        String[] arr = new String[2];
//        arr[0] = "Hello";
//
//        List<String> list3 =   Arrays.stream(arr)
//                .filter(s -> s.length() == 5) // Intermediate operation  abc Hello  people
//                .map(s -> s.toUpperCase()) // Intermediate operation   HELLO  WORLD  PEOPLE
//                .limit(2) // HELLO WORLD  PEOPLE
//                .sorted() // HELLO  WORLD
//                .peek( s -> System.out.println(s)) //HELLO  WORLD
//                .collect(Collectors.toList());  // Terminal operation  => HashSet  HELLO WORLD
//
//
//        Set<String> set = list.stream() // Source
//                .filter(s -> s.length() == 5) // Intermediate operation  abc Hello  people
//                .map(s -> s.toUpperCase()) // Intermediate operation   HELLO  WORLD  PEOPLE
//                .limit(2) // HELLO WORLD  PEOPLE
//                .sorted() // HELLO  WORLD
//                .peek( s -> System.out.println(s)) //HELLO  WORLD
//               .collect(Collectors.toSet());  // Terminal operation  => HashSet  HELLO WORLD
//
//      list.stream()
//              .mapToInt(s  ->  s.length())
//              .max();
//
//
//      list.stream()
//              .filter(s -> s.length() == 5) // operatie intermediara
//              .forEach(s -> System.out.println(s)); // terminal



       Integer res =   Arrays.asList(1, 2, 3)
                .stream()
               .peek(s -> System.out.println(s)) // 1, 2, 3
               .reduce(1, (a, b)  ->  a + 2 + b * 2 ); // (1, 1) -> 1 * 1  => 1 ;   (1, 2) -> 1 * 2; => 2; (2, 3) -> 2*3 => 6

        System.out.println(res);


       Integer val = Arrays.asList(1, 2, 3).stream()
               .filter(s -> s == 2)
               .findAny() // Optional.of(2);  Optional.empty();
               .orElseGet(() ->  new Ion().getIdnpInt());


     String str = Arrays.asList("Hello", "World", "World2", "World3").stream()
             .filter(s -> s.startsWith("T")) // Hello World
             .findFirst()// World
             .orElse("Default");


       Integer age = null;

       String name = null;

       if(name != null) {
           name = "Default";
       }

        if(age != null) {
            age.equals(2);
        }

        Optional<String> name0ptional = Optional.of("Hello");
        Optional<String> name0ptional2 = Optional.empty(); // fale

       String defaultVal = name0ptional.orElse("Default");
       String defaultVal2 = name0ptional2.orElseThrow(() -> new RuntimeException());
       String defaultVal3 = name0ptional2.orElseGet(() ->   "Default");


       if(!name0ptional.isPresent()) {
           String a = name0ptional.get();
          a = "Default";
       }

       Arrays.asList("Hello", "World").stream()
               .map(s -> s.toUpperCase())
               .forEach((s) -> System.out.println(s));


       List<List<Integer>> listInt = new ArrayList<>();

       List<Integer> list1 = Arrays.asList(1, 2, 3);    // 1, 2, 3, 4, 5, 6, 7, 8
       List<Integer> list2 = Arrays.asList(4, 5, 6);
       List<Integer> list3 = Arrays.asList(7, 8, 9);

       listInt.add(list1);
       listInt.add(list2);
       listInt.add(list3);


       for(List<Integer> intList  : listInt) {

           for (Integer x  :  intList) {
               System.out.println(x); // 1, 2, 3, 4, 5, 6, 7, 8, 9
           }

       }

       listInt.stream()
               .flatMap(x ->  x.stream())// 1, 2, 3, 4, 5, 6, 7, 8
               .filter( s -> s > 2)
               .forEach(s -> System.out.println(s)); // 3, 4, 5, 6, 7, 8


    }


}