package tarea2;

import java.util.ArrayList;
import java.util.List;

public class GenericService<T> {

  List<T> guests = new ArrayList<>();

  // crud = create, read, update, delete

  public void create(T name) {
    guests.add(name);
  }

  public List<T> read() {
    return guests;
  }

  public T read(Integer index) {
    try {
      var a = guests.get(index);
    } catch (Exception e) {
      System.out.println("El invitado no existe");
    }

    try {
      return guests.get(index);
    } catch (Exception e) {
      if (e instanceof IndexOutOfBoundsException) {
        System.out.println("El invitado no existe");
      }
      return null;
    }
  }

  public Integer getIndex(T name) {
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

  public void update(T name, T newName) {
    if (!guests.contains(name)) {
      System.out.println("El invitado no existe");
      return;
    }
    int index = getIndex(name);
    guests.set(index, newName);
  }

  public void delete(T name) {
    if (!guests.contains(name)) {
      System.out.println("El invitado no existe");
      return;
    }
    guests.remove(name);
  }

  public void delete(int index) {
    guests.remove(index);
  }

  // public List<T> filterGuestsByChar(Character letter) {

  // return guests.stream()
  // .filter(guest -> this.filter(guest, letter))
  // .collect(Collectors.toList());

  // }

}
