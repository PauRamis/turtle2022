import java.util.Scanner;

public class Exercici5 {
    static Turtle t = new Turtle(500,500);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de quadres concèntrics: ");
        int numQuad = scanner.nextInt();
        System.out.println("Longitud inicial del quadre");
        int lQuad = scanner.nextInt();

        bucle(lQuad, numQuad);

        t.show();
    }

    private static void bucle(int lQuad, int numQuad) {
        for (int i = 0; i < numQuad; i++) {
            cuadrat(lQuad, i);
            t.setPenDown(false);
            t.turnLeft(90);
            t.forward(10);
            t.turnLeft(90);
            t.forward(10);
            t.turnRight(180);
            t.setPenDown(true);
        }
    }

    private static void cuadrat(int lQuad, int increm){
        for (int i = 0; i < 4; i++) {
            int increment = increm*20;
            t.forward(lQuad+increment);
            t.turnRight(90);
        }
    }

}
