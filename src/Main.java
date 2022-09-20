import java.util.*;
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

//        Отфильтруйте положительные числа.
    Predicate<Integer> isPositive = (x -> x > 0);
    List<Integer> positiveList = new ArrayList<>();
    for (int e : list) {
      if (isPositive.test(e)) {
        positiveList.add(e);
      }
    }

//        Найдите среди этих положительных чисел четные.
    List<Integer> evenList = new ArrayList<>();
    for (int e : positiveList) {
      if (e % 2 == 0) {
        evenList.add(e);
      }
    }

//        Отсортируйте отфильтрованные числа в порядке возрастания.
    List<Integer> sortedList = new ArrayList<>();
    sortedList.addAll(evenList);
    sortedList.sort(Integer::compareTo);

//        Выведите результат на экран.
    System.out.println(sortedList);
  }
}






