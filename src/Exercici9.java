import java.util.Scanner;

public class Exercici9 {
    static Turtle t = new Turtle(500, 500);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Longitud de costat i: ");
        int lCostat = scanner.nextInt();
        System.out.println("Número de triangles");
        int ntriangles = scanner.nextInt();

        //Calculs trigonometrics
        int angleCentre = 360 / ntriangles;
        int hipotenusa = (int) ((lCostat/2) / (Math.sin(angleCentre/2)));
        int anglesCostat = ((180 - angleCentre) / 2);

        //Bucle de triangles
        //for (int i = 0; i < ntriangles; i++) {
            triangle(lCostat, hipotenusa, anglesCostat, angleCentre);
            //t.turnLeft(angleCentre);
        //}

        //Mostra
        t.markCursor();
        t.show();
    }

    private static void triangle(int lCostat, int hipotenusa, int anglesCostat, int angleCentre) {
        t.forward(hipotenusa);
        t.turnRight(anglesCostat);

        t.forward(lCostat);
        t.turnRight(anglesCostat);

        t.forward(hipotenusa);
    }
}
