package array;

import java.util.HashMap;

public class learn {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,2);
        map.put(1,4);
        map.put(2,3);
        map.put(3,10);
        map.put(4,25);
        for(int i: map.keySet()) {
            System.out.println("Key:" + i + "Value:" + map.get(i));
        }
    }
}
