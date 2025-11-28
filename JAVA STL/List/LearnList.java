import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        // String[] studentName = new String[30];

        // studentName[0] = "Aishwary";

        // studentName[29] = "Avantika";

        // studentName[30] = "Radhika";

        List<String> studentName = new ArrayList<>();

        studentName.add("Aishwary");
        studentName.add("Swinal");
        studentName.add("karan");
        studentName.add("parth");

        System.out.println(studentName);

        studentName.add("Shama");
        System.out.print(studentName);

        studentName.add(0, "Veera");
        System.out.println(studentName);

        List<String> newList = new ArrayList<>();

        newList.add("Nikita");
        newList.add("Ruchita");
        newList.add("Waghmare");

        System.out.println(newList);

        studentName.addAll(newList); // to merge the list with same datatype
        System.out.println(studentName);

        System.out.println(studentName.get(3)); // to get the element from array

        studentName.remove(4); // to remove the element
        System.out.println(studentName);

        // studentName.clear(); //to clear all element from the list
        // System.out.println(studentName);

        studentName.set(1, "Rakesh"); // will add the element in the list.
        System.out.println(studentName);

        System.out.println(studentName.contains("Nikita"));

        for (int i = 0; i < studentName.size(); i++) {
            System.out.println("My ClassMates Name Are " + studentName.get(i));
        }

        for(String element: studentName){
            System.out.println("For Each Element " + element);
        }

        Iterator<String> it = studentName.iterator();

        while (it.hasNext()) {
            System.out.println("Element "+ it.next());
            
        }
    }
}
