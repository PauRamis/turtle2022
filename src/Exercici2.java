import java.util.Scanner;

public class Exercici2 {
    static Turtle t = new Turtle(500,500);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pixels en horitzontal: ");
        int pixelsHorizontal = scanner.nextInt();
        System.out.println("Pixels en vertical: ");
        int pixelsVertical = scanner.nextInt();
        System.out.println("Nombre d'escalons");
        int numEscalons = scanner.nextInt();

        t.turnRight(90);
        capAvall(numEscalons, pixelsHorizontal, pixelsVertical);
        middleLine(pixelsHorizontal);
        capAmunt(numEscalons, pixelsHorizontal, pixelsVertical);
        t.show();
    }

    private static void capAvall(int numEscalons, int pixelsHorizontal, int pixelsVertical) {
        for (int i = 0; i < numEscalons; i++) {
            baixarEscalo(pixelsHorizontal, pixelsVertical);
        }
    }

    private static void middleLine(int pixelsHorizontal) {
        t.forward(pixelsHorizontal*2);
    }

    private static void capAmunt(int numEscalons, int pixelsHorizontal, int pixelsVertical) {
        for (int i = 0; i < numEscalons; i++) {
            pujarEscalo(pixelsHorizontal, pixelsVertical);
        }
    }

    private static void baixarEscalo(int pixelsHorizontal, int pixelsVertical) {
            t.forward(pixelsHorizontal);
            t.turnRight(90);
            t.forward(pixelsVertical);
            t.turnLeft(90);
    }

    private static void pujarEscalo(int pixelsHorizontal, int pixelsVertical) {
        t.turnLeft(90);
        t.forward(pixelsVertical);
        t.turnRight(90);
        t.forward(pixelsHorizontal);
    }
}
