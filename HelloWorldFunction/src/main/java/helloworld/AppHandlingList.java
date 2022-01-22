package helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppHandlingList {

    public List<Integer> verifyListHandling(List<String> listOfStudentsNames) {

        Map<String, Integer> studentNameToMarksMap = new HashMap<>();
        studentNameToMarksMap.put("Aditya", 98);
        studentNameToMarksMap.put("Sidharth", 78);
        studentNameToMarksMap.put("Raj", 81);

        List<Integer> listOfMarksReceived = new ArrayList<>();

        listOfStudentsNames.forEach(name -> {
            System.out.println("Name thus received right now is : " + name);
            listOfMarksReceived.add(studentNameToMarksMap.get(name));
        });

        return listOfMarksReceived;
    }

}


