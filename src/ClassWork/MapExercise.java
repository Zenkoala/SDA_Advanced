package ClassWork;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<Integer, String> pins = new HashMap<>();

        pins.put(1234,"Aleks");
        pins.put(1235,"Victor");
        pins.put(1236,"Serhan");

        System.out.println("Total pins: " + pins.size());

        System.out.println(pins.keySet());


    }
}
