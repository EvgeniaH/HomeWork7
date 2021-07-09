public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Рыжик", 5);
        cats[1] = new Cat("Марси", 9);
        cats[2] = new Cat("Вася", 5);


        Plate plate = new Plate(5);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();


            System.out.println("Кот " + cat.getName() + " скушал " + cat.getAppetite() + " граммов корма ");

            if (!plate.decreaseFood(cat.getAppetite())) {
                plate.addFood(100);
            }

        }
        System.out.println("\nВ миске осталось " + plate.getFood() + " грамм корма.\n");

    }

}
