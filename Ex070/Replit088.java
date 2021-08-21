package Ex070;

interface IDogBehaviors {
    public void bark();
    public void run();
    public void play();
}

class Dog implements IDogBehaviors {
    private String breed;
    private String name;
    private String color;

    public Dog(String breed, String name, String color) {
        this.breed = breed;
        this.name = name;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void bark() {
        System.out.println(this.breed + " can bark");
    }

    @Override
    public void run() {
        System.out.println(this.breed + " can run");

    }

    @Override
    public void play() {
        System.out.println(this.breed + " can play");

    }

    public void DoAllThree() {
        bark();
        run();
        play();
    }
}

class Replit088 {

    public static void main(String[] args) {

        IDogBehaviors dog1 = new Dog ("Husky" , null  , null);
        Dog dog2 = new Dog ("Bull Dog" , null  , null);
        Dog dog3 = new Dog ("Labrador" , null  , null);
        dog1.bark();
        dog1.run();
        dog1.play();
        dog2.DoAllThree();
        dog3.DoAllThree();
    }
}