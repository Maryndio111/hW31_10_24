import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        LinkedList<Integer>list2 = new LinkedList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        LinkedList<Boolean>comparisonResult = ListComparator.compareLists(list1,list2);
        System.out.println(comparisonResult);

    }
}