package Map;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map1.put("b", 3);
        map1.put("c", 4);

        Map<String, Integer> res = mergeMap(map1, map2);
        System.out.println(res);
    }

    private static Map<String, Integer> mergeMap( Map<String, Integer> map1,  Map<String, Integer> map2) {
        Map<String, Integer> res = new HashMap<>();
        res.putAll(map1);
        res.putAll(map2);

        return res;
    }
}
