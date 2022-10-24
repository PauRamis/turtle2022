import java.util.Scanner;

public class Exercici3 {

    static Turtle t = new Turtle(500,500);
    static int cLenght = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Caudrats en horitzontal: ");
        int cuadratsHorizontal = scanner.nextInt();
        System.out.println("Cuadrats en horitzontal: ");
        int cuadratsVertical = scanner.nextInt();

        for (int i = 0; i < cuadratsVertical; i++) {
            hRow(cuadratsHorizontal);
            reset(cuadratsHorizontal);
            prepareNext();
        }

        // Show cursor
        t.markCursor();

        // Show canvas
        t.show();
    }

    private static void prepareNext() {
        t.forward(cLenght);
    }

    private static void hRow(int cuadratsHorizontal) {
        for (int i = 0; i < cuadratsHorizontal; i++) {
            cuadrat();
            next();
        }
    }

    private static void reset(int cuadratsHorizontal) {
        t.setPenDown(false);
        t.turnRight(90);
        t.forward(cLenght * cuadratsHorizontal);
        t.turnLeft(90);
        t.setPenDown(true);
    }

    private static void next() {
        t.setPenDown(false);
        t.forward(cLenght);
        t.turnRight(90);
        t.setPenDown(true);
    }


    private static void cuadrat(){
        for (int i = 0; i < 3; i++) {
            t.forward(cLenght);
            t.turnRight(90);
        }
        t.forward(cLenght);
    }
}
