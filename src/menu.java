import java.util.Scanner;

public class menu {



    public  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve solve = new solve();



        int opcion;

        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt(); // Lee la opción del usuario

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la Opción 1.");
                    solve.Casteo1();
                    break;
                case 2:
                    System.out.println("Has elegido la Opción 2.");
                    // Aquí puedes llamar a métodos o realizar acciones específicas
                    break;
                case 3:
                    System.out.println("Has elegido la Opción 3.");
                    // Aquí puedes llamar a métodos o realizar acciones específicas
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige otra opción.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
