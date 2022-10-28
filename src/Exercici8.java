public class Exercici8 {
    static Turtle t = new Turtle(500,500);

    public static void main(String[] args) {
        t.turnLeft(30);

        for (int i = 0; i < 4; i++) {
            triangle();
            gir();
        }
        t.show();
    }

    private static void gir() {
        t.turnLeft(90);
    }

    private static void triangle() {
        for (int i = 0; i < 3; i++) {
            t.forward(50);
            t.turnRight(120);
        }

    }
}
