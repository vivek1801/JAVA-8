package Session2;

import java.util.Arrays;
import java.util.List;

public class NewSapeintTest1 {

    public static void main(String...args) {
        List<Project> projects= Arrays.asList(
                new Project("120645","Siemens", "Ravi"),
                new Project("256109","ShawComm","Vijay" ),
                new Project("121211","Kuoni", "Vinay")
        );
        printNameConditionally(projects, new ProjectPredicate<Project>() {
            @Override
            public boolean test(Project p) {

                    if (p.getDirector().equalsIgnoreCase("Ravi")) {
                        return true;
                    }
                    return false;
            }
        });
    }

    private static void printNameConditionally(List<Project> projects, ProjectPredicate projectPredicate) {
        for (Project p : projects)
        {
            if(projectPredicate.test(p))
            {
                System.out.println(p.toString());
            }
        }
    }
}


