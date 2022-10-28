public class Exercici10 {
    static Turtle t = new Turtle(500,500);

    public static void main(String[] args) {
        int length = 115;
        figura(length);
        t.show();
    }

    private static void figura(int length) {
        triangle(length);
        t.turnLeft(90);
        triangle(length);
    }

    private static void triangle(int length) {
        t.forward(length);
        t.turnRight(90);
        for (int i = 0; i < 90; i++) {
            t.turnRight(1);
            t.forward(2);
        }
        t.turnRight(90);
        t.forward(length);
    }
}
