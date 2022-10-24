import java.util.Scanner;

public class Exercici4 {
    static Turtle t = new Turtle(500,500);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de fulles: ");
        int numFulles = scanner.nextInt();
        System.out.println("Longitud de la fulla: ");
        int lFulla = scanner.nextInt();

        t.forward(lFulla/2);
        pujada(lFulla, numFulles);
        punta(lFulla);
        baixada(lFulla, numFulles);
        //t.forward(lFulla/2);


        //t.markCursor();
        t.show();
    }

    private static void pujada(int lFulla, int numFulles) {
        for (int i = 0; i < numFulles; i++) {
            fulla(lFulla);
            t.turnLeft(45);
        }
    }

    private static void punta(int lFulla) {
        t.turnRight(45);
        t.forward(lFulla/4);
        t.turnRight(90);
        t.forward(lFulla/3);
    }

    private static void baixada(int lFulla, int numFulles) {
    }

    private static void fulla(int lFulla) {
        t.turnLeft(90);
        t.forward(lFulla);
        t.turnRight(135);
        t.forward((int) Math.hypot(lFulla, lFulla));
    }
}
