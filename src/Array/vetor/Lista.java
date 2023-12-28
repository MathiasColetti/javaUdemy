package Array.vetor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Mathias");
        stringList.add("Marco");
        stringList.add("Dante");
        stringList.add(0, "Joyce");

        for (String string : stringList) {
            System.out.println(string);
        }

        for (String string : stringList) {
            System.out.println(string);
        }

        System.out.println("__________________");
        System.out.println("Indexof Dante" + stringList.indexOf("Mathias"));


        List<String> result = stringList.stream().filter((x -> x.charAt(0) == 'M')).collect(Collectors.toList());

        for (String string : result) {

            System.out.println(result);

        }

    }
}
