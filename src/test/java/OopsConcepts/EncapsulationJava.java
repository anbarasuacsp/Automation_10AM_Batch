package OopsConcepts;

class Student {


    private String name;


    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        System.out.println("Student name: " + s.getName());
    }
}

