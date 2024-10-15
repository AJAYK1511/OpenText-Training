import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store keys and values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // Access and print values from the map
        for (String key : map.keySet()) {
            System.out.println(key + "'s value: " + map.get(key));
        }
    }
}
