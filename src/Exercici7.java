import java.util.Scanner;

public class Exercici7 {
    static Turtle t = new Turtle(500,500);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de fulles: ");
        int nFulles = scanner.nextInt();

        for (int i = 0; i < nFulles; i++) {
            fulla();
            girar(nFulles);
        }
        t.show();
    }

    private static void fulla() {
        fullaAsc();
        fullaDesc();
    }

    private static void fullaAsc() {
        for (int i = 0; i < 90; i++) {
            t.turnRight(1);
            t.forward(2);
        }
    }

    private static void fullaDesc() {
        t.turnRight(90);
        for (int i = 0; i < 90; i++) {
            t.turnRight(1);
            t.forward(2);
        }
        t.turnRight(90);
    }

    private static void girar(int nFulles) {
        t.turnRight(360/nFulles);
    }
}
