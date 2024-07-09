package dataStructure.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

// 이미 Comparable이 구현된 경우 Comparator로 비교하는 방식을 다시 구현할 수 있다.
class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2) * (-1);
    }

}
public class ComparatorTest {
    public static void main(String[] args) {
        // TreeSet에서 comparator를 쓰는 방법
        // comparator가 구현된 객체를 쓰는 것
        TreeSet<String> set = new TreeSet<String>(new MyCompare());
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);
    }
}
