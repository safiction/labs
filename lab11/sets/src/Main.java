import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("string");
        mySet.add("one more element");
        mySet.add("element");
        mySet.add("last one");

        System.out.println("Original set: " + mySet);

        Iterator<String> myIter = mySet.iterator();

        while (myIter.hasNext()) {
            if (myIter.next().length()%2 == 1)
                myIter.remove();
        }

        System.out.println("Set without odd elements: " + mySet);

    }
}