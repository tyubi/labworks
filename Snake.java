///////////////////////////////////// this is for the snake class
class Snake extends Reptile {
    public Snake(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override             //override
    public void speak() {
        System.out.println("Hiss!");
    }

    @Override               //override
    public void displayInfo() {
        System.out.println("Snake - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
