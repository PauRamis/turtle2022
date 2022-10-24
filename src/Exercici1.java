import java.util.Scanner;

public class Exercici1 {
    static Turtle t = new Turtle(500,500);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Caudrats en horitzontal: ");
        int cuadratsHorizontal = scanner.nextInt();
        System.out.println("Cuadrats en vertical: ");
        int cuadratsVertical = scanner.nextInt();
        System.out.println("Longitut costats");
        int cLenght = scanner.nextInt();

        for (int i = 0; i < cuadratsVertical; i++) {
            hRow(cuadratsHorizontal, cLenght);
            reset(cuadratsHorizontal, cLenght);
            prepareNext(cLenght);
        }
        // Show canvas
        t.show();
    }

    private static void prepareNext(int cLenght) {
        t.setPenDown(false);
        t.forward(cLenght*2);
        t.setPenDown(true);
    }

    private static void hRow(int cuadratsHorizontal, int cLenght) {
        for (int i = 0; i < cuadratsHorizontal; i++) {
            cuadrat(cLenght);
            next(cLenght);
        }
    }

    private static void reset(int cuadratsHorizontal, int cLenght) {
        t.setPenDown(false);
        t.turnRight(90);
        t.forward(cLenght * cuadratsHorizontal * 2);
        t.turnLeft(90);
        t.setPenDown(true);
    }

    private static void next(int cLenght) {
        t.setPenDown(false);
        t.forward(cLenght*2);
        t.turnRight(90);
        t.setPenDown(true);
    }


    private static void cuadrat(int cLenght){
        for (int i = 0; i < 3; i++) {
            t.forward(cLenght);
            t.turnRight(90);
        }
        t.forward(cLenght);
    }
}