public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }

    void addFood(int food) {
        this.food += 50;
        System.out.println("В миску добавили 50 грамм корма");
    }

    void info() {
        System.out.println("plate: " + food);
    }
}

