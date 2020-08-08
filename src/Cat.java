public class Cat extends Main {
    String name;
    boolean satiety;
    int appetite;

    public Cat(String name, int satiety, int appetite) {
        this.name = name;
        this.satiety = false;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (this.appetite <= plate.food) {
            plate.decreaseFood(this.appetite);
            this.satiety = true;
        } else {
            System.out.println(this.name + " не хватило еды");
            this.satiety = false;
        }
    }
}

