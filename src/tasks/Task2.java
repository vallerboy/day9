package tasks;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {







        Map<Integer, Integer> map = new HashMap<>();
        int[] ints = {1,1,1,1,2};

        for (int anInt : ints) {
            if(map.containsKey(anInt)){
                map.replace(anInt, (map.get(anInt)+1));
            }else{
                map.put(anInt, 1);
            }
        }


        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            System.out.println("Liczba: " + integerIntegerEntry.getKey() + " wystepuje " + integerIntegerEntry.getValue() + " razy");
        }
    }
}
