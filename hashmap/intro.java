package hashmap;

import java.util.HashMap;

public class intro {
    public static void main(String[] args) {
        // String name="satya";
        // int code=name.hashCode();
        // System.out.println(code);
        // System.out.println(name);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("satya",88);
        map.put("raju",87);
        System.out.println(map);
        System.out.println(map.get("satya"));
        System.out.println(map.containsKey("raju"));//true
        System.out.println(map.containsKey("satyam"));//false
    }
}
