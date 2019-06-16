package E100_High_Fequence;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private int capacity;
    private Map<Integer,Integer>map= new LinkedHashMap<>();
    public LRUCache(int capacity) {

        this.capacity=capacity;

    }

    public int get(int key) {

        if (map.keySet().contains(key)){
            int value=map.get(key);
            map.remove(key);
            map.put(key,value);
            return value;
        }
        else if (map.size()==0){

            return -1;
        }
        return -1;
    }

    public void put(int key, int value) {

        if (map.keySet().contains(key)){
            map.remove(key);
        }
        else if( map.size()==capacity) {
            Iterator<Map.Entry<Integer,Integer>>iterator=map.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }

        map.put(key,value);
    }

}
