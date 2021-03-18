import java.util.LinkedHashMap;

public class Task1 {
    public static void main(String[] args) {
        Integer[] array = {2,5,7,2,8,5,1,2,11,55,7,8,1,11,8};
        System.out.println(sortCount(array).toString());
    }
    static LinkedHashMap<Integer, Integer> sortCount(Integer[]array) {
        LinkedHashMap<Integer,Integer> coll = new LinkedHashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (coll.containsKey(array[i]))
                coll.put(array[i], coll.get(array[i]) + 1);
            else coll.put(array[i], 1);
        }
        return coll;
    }
}
