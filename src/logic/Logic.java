package logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Logic {
    public static ArrayList<int[]> findTriples(int[] arr, int s) {
        ArrayList<int[]> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();   //Map<String, Integer> map = new SimpleHashMap<>(arr.length);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] < s) {
                    String key = i + " " + j;
                    map.put(key, s - arr[i] - arr[j]);
                }
            }
        }

        for (Map.Entry<String, Integer> element : map.entrySet()) {
            String[] ijValues = element.getKey().split(" ");
            int i = Integer.parseInt(ijValues[0]);
            int j = Integer.parseInt(ijValues[1]);

            for (int k = j + 1; k < arr.length; k++) {
                if (arr[k] == element.getValue()) {
                    addToAnswer(answer, arr[i], arr[j], arr[k]);
                }
            }
        }

        return answer;
    }

    public static void addToAnswer (ArrayList<int[]> list, int elem1,int elem2, int elem3) {
        int[] tempArr = new int[] {elem1, elem2, elem3};
        list.add(tempArr);
    }
}