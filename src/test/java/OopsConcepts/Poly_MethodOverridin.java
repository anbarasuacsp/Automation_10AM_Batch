package OopsConcepts;

class Animal_Methodoverridding {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal_Methodoverridding {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal_Methodoverridding a = new Cat();  // Upcasting
        a.sound();  // Calls overridden method
    }
}
