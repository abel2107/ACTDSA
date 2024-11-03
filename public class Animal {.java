public class Animal {
    public void sound () {
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal {
    public void sound () {
        System.out.println("Dog make woofff");
    }
}
class Bird extends Animal {
    public void sound () {
        System.out.println("Bird make tweet");
    }
}
class Animalsounds {
    public void sound () {
        Animal animal = Animal();
        Dog dog = Dog();
        Bird bird = Bird();
        animal.sound();
        dog.sound();
        bird.sound();
    }
}
