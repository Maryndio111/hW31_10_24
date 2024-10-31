import java.util.LinkedList;

public class ListComparator {
    public static LinkedList<Boolean>compareLists(LinkedList<Integer>list1, LinkedList<Integer>list2) {
        LinkedList<Boolean> result = new LinkedList<>();
        if (list1.size() != list2.size()) {
            throw new IllegalArgumentException("Списки должны быть одинаковой длины.");

        }
        for (int i = 0; i <list1.size(); i++) {
            result.add(list1.get(i).equals(list2.get(i)));
        }
        return result;
    }


    }

