package tarea1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Array {

  static List<String> guests = new ArrayList<>();

  // crud = create, read, update, delete

  public static void create(String name) {
    guests.add(name);
  }

  public static List<String> read() {
    return guests;
  }

  public static String read(Integer index) {
    try {
      return guests.get(index);
    } catch (Exception e) {
      if (e instanceof IndexOutOfBoundsException) {
        System.out.println("El invitado no existe");
      }
      return "";
    }
  }

  public static Integer getIndex(String name) {
    if (!guests.contains(name)) {
      System.out.println("El invitado no existe");
      return -1;
    }
    int index = 0;
    for (int i = 0; i < guests.size() - 1; i++) {
      if (guests.get(i).equals(name)) {
        index = i;
        break;
      }
    }
    return index;
  }

  public static void update(String name, String newName) {
    if (!guests.contains(name)) {
      System.out.println("El invitado no existe");
      return;
    }
    int index = getIndex(name);
    guests.set(index, newName);
  }

  public static void delete(String name) {
    if (!guests.contains(name)) {
      System.out.println("El invitado no existe");
      return;
    }
    guests.remove(name);
  }

  public static void delete(int index) {
    guests.remove(index);
  }

  public static List<String> filterGuestsByChar(Character letter) {

    return guests.stream()
        .filter(guest -> Array.filter(guest, letter))
        .collect(Collectors.toList());

  }

  private static boolean filter(String name, Character letter) {
    return name.toLowerCase().contains(letter.toString());
  }

}
