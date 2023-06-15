///////////////////////////////// this is for the Eagle class
class Eagle extends Bird {
    public Eagle(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Screech!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Eagle - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}