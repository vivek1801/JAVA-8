package Session2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoClass2 {
    public static void main(String... args) {
        char a[]="test".toCharArray();
        List<Project> projects = Arrays.asList(
                new Project("120645", "Siemens", "Ravi"),
                new Project("256109", "ShawComm", "Vijay"),
                new Project("121211", "Kuoni", "Vinay")
        );

       Predicate<Project> projectPredicate = p -> p.getProjectName().equalsIgnoreCase("Kuoni");
        for (Project p1 : projects) {
            if (projectPredicate.test(p1)) {
                System.out.println(p1.toString());
            }
        }
        NumberSum norm=(x,y)->x+y;
        int x=norm.sum(2,5);
        System.out.println("Sum :::"+x);
    }
}

interface NumberSum{
    int sum(int a, int b);
}
