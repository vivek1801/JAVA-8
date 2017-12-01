package Session2;

import java.util.Arrays;
import java.util.List;

public class NewSapientTest1Lambda {

    public static void main(String... args) {
        List<Project> projects = Arrays.asList(
                new Project("120564", "Siemens", "Ravi"),
                new Project("256109", "ShawComm", "Vijay"),
                new Project("121211", "Kuoni", "Vinay")
        );
        printIfExists(projects, p1 -> p1.getProjectId().equalsIgnoreCase("120564"));
        printIfExists(projects, p1 -> p1.getDirector().equalsIgnoreCase("Vinay"));
    }

    private static void printIfExists(List<Project> projects, ProjectPredicate<Project> projectPredicate) {
        for (Project p : projects) {
            if (projectPredicate.test(p))
                 System.out.println(p.toString());
        }
        projects.stream().filter(p->p.getProjectId().equalsIgnoreCase("120564")).forEach(System.out::println);
    }

}
