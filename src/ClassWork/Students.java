package ClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aleks");
        names.add("Anastacia");
        names.add("Tauri");
        names.add("Serhan");
        names.add("Victor");
        names.add("Louis");
        names.add("Bobur");

        System.out.println(names);

        System.out.println(names.size());

        names.remove("Tauri");
        System.out.println(names.size());
        System.out.println(names.contains("Aleks"));

        int count = 0;
        for (String element : names) {
            if (element.startsWith("A")) {
                count++;
            }
        }
        System.out.println(count + " elements");
        Collections.reverse(names);
        System.out.println(names);

    }
}
