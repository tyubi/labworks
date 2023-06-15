public class Main {
    public static void main(String[] args) {
        // Instantiate different animal objects
        Lion lion = new Lion("King", 4, "Male");
        Elephant elephant = new Elephant("Sylvie", 7, "Female");
        Snake snake = new Snake("Prye", 3, "Male");
        Lizard lizard = new Lizard("Dell" , 1, "Female");
        Eagle eagle = new Eagle("Frits", 10, "Male");
        Parrot parrot = new Parrot("Clefie", 6, "Female");

        // Call displayInfo() and speak() methods
        lion.displayInfo();
        lion.speak();

        elephant.displayInfo();
        elephant.speak();

        snake.displayInfo();
        snake.speak();

        lizard.displayInfo();
        lizard.speak();

        eagle.displayInfo();
        eagle.speak();

        parrot.displayInfo();
        parrot.speak();

    }