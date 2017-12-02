package Session3;

class Student {
    private int age;         //instance variable
    private String name;     //instance variable

    public Student() {
        this.age = 0;
        name = "Anonymous";
    }

    public Student(int Age, String Name) {
        this.age = Age;
        setName(Name);
    }

    public void setName(String Name) {
        this.name = Name;
    }
}

public class MemoryAllocation {
    public static void main(String... args) {
        Student s;                   //local variable - reference
        s = new Student(24, "VK");
        int noStudents = 1;          //local variable
    }
}
