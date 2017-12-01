package Session3;

import java.util.*;

public class OptionalMain {

    public static String getProjectMoney(Optional<Employee> emp) {
        return emp.flatMap(Employee::getManager)
                     .flatMap(Manager::getProject)
                     .map(Project::getMoney)
                     .orElse("Unknown");
    }
}
