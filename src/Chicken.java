public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Cuc tac";
    }

    @Override
    public String howToEat() {
        return "Chicken: Cuc cuc";
    }
}
