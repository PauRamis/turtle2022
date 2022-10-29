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
        double angleCentre = 360.0 / ntriangles;
        double anglesCostat = (180.0 - angleCentre) / 2.0;
        double hipotenusa = (lCostat / 2.0) / Math.cos((anglesCostat * Math.PI) / 180);

        //Bucle de triangles
        //for (int i = 0; i < ntriangles; i++) {
        triangle(lCostat, hipotenusa, anglesCostat);
        //t.turnLeft(angleCentre);
        //}

        //Mostra
        t.markCursor();
        t.show();
    }

    private static void triangle(int lCostat, double hipotenusa, double anglesCostat) {
        t.forward((int) hipotenusa);
        t.turnLeft(180 - (int) anglesCostat);
        t.forward(lCostat);
        t.turnLeft(180 - (int) anglesCostat);
        t.forward((int) hipotenusa);
    }


}
