package misc.pointers;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int a = 11;
        int b = a;
        a = 22;
        System.out.println(a);
        System.out.println(b);

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("value", 33);
        map2 = map1;
        map1.put("value", 44);
        System.out.println(map1);
        System.out.println(map2);
    }
}