import java.util.List;

import tarea3.challenges.Challenges;

import java.util.ArrayList;
import java.util.HashMap;

public class App {

  public static void main(String[] args) throws Exception {
    Challenges.isPalindrome(121);

  }

  public static void getUniques(List<Integer> list) {
    var newList = new ArrayList<Integer>();
    var hashMap = new HashMap<Integer, Integer>();

    // {
    // 1: 1
    // }

    for (int i = 0; i < list.size(); i++) {
      if (!hashMap.containsKey(list.get(i))) {
        newList.add(list.get(i));
        hashMap.put(list.get(i), list.get(i));
      }
    }

  }

}
