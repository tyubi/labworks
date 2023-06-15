///////////////////////////////////////////// this is the abs part 
abstract class Animal {
    private String name;
    private int age;
    private String gender;

    ////////////////////////////////////////// set properties for the animals
    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /////////////////////////////////////////// this is the mothodology for abs
    public abstract void speak();

    public abstract void displayInfo();

    /////////////////////////////////////// this is the getter method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    //////////////////////////////////////////// this part is the setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

//////////////////////////////////////////////////////////// abs class for mammal
abstract class Mammal extends Animal {
    public Mammal(String name, int age, String gender) {
        super(name, age, gender);
    }
}

///////////////////////////////////////////////////////////// abs class for reptiles
abstract class Reptile extends Animal {
    public Reptile(String name, int age, String gender) {
        super(name, age, gender);
    }
}

//////////////////////////////////////////////// abs class for birds 
abstract class Bird extends Animal {
    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }
}
