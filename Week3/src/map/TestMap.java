package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 40);
        map.put("c", 20);
        map.put("d", 30);

        System.out.println("Display entries in HashMap");
        System.out.println(map);

        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println("Display entries in TreeMap");
        System.out.println(treeMap);
    }
}
