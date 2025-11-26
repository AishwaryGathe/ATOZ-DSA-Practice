import java.util.ArrayList;
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

        studentName.add(0,"Veera");
        System.out.println(studentName);


        List<String> newList = new ArrayList<>();

        newList.add("Nikita");        
        newList.add("Ruchita");
        newList.add("Waghmare");

        System.out.println(newList);
        
        studentName.addAll(newList);
        System.out.println(studentName);


    }
}
