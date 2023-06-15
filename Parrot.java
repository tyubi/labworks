// Parrot class
class Parrot extends Bird {
    public Parrot(String name, int age, String gender) {
        super(name, age, gender);
    }
    
    @Override
    public void speak() {
        System.out.println("Squawk!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Parrot - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }


}