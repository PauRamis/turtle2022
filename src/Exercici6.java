import java.util.Scanner;

public class Exercici6 {
    static Turtle t = new Turtle(500,500);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de voltes: ");
        int nVoltes = scanner.nextInt();
        System.out.println("Número de costats");
        int nCostats = scanner.nextInt();

        espiral(nVoltes, nCostats);

        t.markCursor();
        t.show();
    }

    private static void espiral(int nVoltes, int nCostats) {
        //cada volta es podria dir que son 8 costats
        int curva = 360/nCostats;
        int longitut = 10;
        int rep = nVoltes * 2;
        int half = nCostats / 2;

        //S'augmenta la longitut a la mitat del poligon
        for (int j = 0; j < rep; j++) {
            longitut = longitut + 20;
            for (int i = 0; i < half; i++) {
                t.forward(longitut);
                t.turnRight(curva);
            }
        }
    }
}
