
package tarea3;

import java.util.*;

public class HashMapExamples {
  public static void run() {

    // Creating a HashMap
    HashMap<String, Integer> map = new HashMap<>();

    // Adding key-value pairs
    map.put("Apple", 1);
    map.put("Banana", 2);
    map.put("Orange", 3);

    // Accessing a value
    System.out.println("Value for Apple: " + map.get("Apple"));

    // Checking if a key exists
    System.out.println("Contains Grape? " + map.containsKey("Grape"));

    // Removing a key-value pair
    map.remove("Banana");

    // Iterating over the HashMap
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    // Getting all keys
    System.out.println("Keys: " + map.keySet());

    // Getting all values
    System.out.println("Values: " + map.values());

    // Checking if the map is empty
    System.out.println("Is map empty? " + map.isEmpty());

    // Getting the size of the map
    System.out.println("Size of map: " + map.size());

    // Clearing the map
    map.clear();
    System.out.println("Map after clearing: " + map);
  }
}