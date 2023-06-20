package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("abc", 2);
        map.put("qwe", 3);

        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
