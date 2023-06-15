//////////////////////// this is for the lion class
class Lion extends Mammal {
    public Lion(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Roar!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Lion - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
