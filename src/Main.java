public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Murzik", 0, 5);
        Cat cat2 = new Cat("Kesha", 0, 20);
        Cat cat3 = new Cat("Kuzya", 0, 8);
        Cat cat4 = new Cat("Sezar", 0, 14);

        Cat[] cats = {
                cat1,
                cat2,
                cat3,
                cat4
        };

        System.out.println(cats[3].name);

        Plate plate = new Plate();
        plate.addFood(100);


        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        cat4.eat(plate);

        plate.addFood(50);

        System.out.println(plate.food);

        for (int i =0; i<cats.length; i++) {
            cats[i].satiety = false;
            System.out.println(cats[i].satiety);
        }

        for (int i =0; i<cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].satiety);
        }

    }
}
