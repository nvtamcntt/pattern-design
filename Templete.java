public abstract class Animal {
    public abstract void makeSound()
    public abstract void eatFood()
    public abstract void sleep()

    public void doEveryDay() {
        makeSound()
        eatFood()
        sleep()
    }
}

public class Dog extends Animal {
    public void makeSound() {
        // bark
    }

    public void eatFood() {

    }

    public void sleep() {
        
    }
}