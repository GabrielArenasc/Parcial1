package parcial1;
import java.util.*;

public class Parcial1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> objetos = new ArrayList<>();

        // Menú inicial
        while (true) {
            System.out.println("                Bienvenido al sistema");
            System.out.println("1. Registrarse");
            System.out.println("2. Salir");
            System.out.print("Escriba el numero de una opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Registrarse();
                    break;
                case 2:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
    
    private static void Registrarse(){
        List<String> objetos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Porfavor, ingrese su cedula o tarjeta de dentidad:");
        int card = scanner.nextInt();
        
        System.out.println("bienvenido usuario " + card);
        System.out.println("Que desea hacer");
        System.out.println("1. Ver inventario de la bodega");
        System.out.println("2. Ingresar nuevo producto");
        System.out.println("3. volver");
        System.out.print("Escriba el numero de una opcion: ");
        
        int opcion2 = scanner.nextInt();

            switch (opcion2) {
                case 1:
                    invbod(objetos, scanner);
                    break;
                case 2:
                    elenuv(objetos);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        
    }
    
    private static void invbod(List<String> objetos, Scanner scanner){
        System.out.println("1. Rollo de papel");
        System.out.println("2. Tronco");
        System.out.println("3. Cuaderno");
        System.out.println("4. Lapiz");
        System.out.println("5. Papel iris");
        System.out.println("6. Tijeras");
        System.out.println("7. Pegamento");
        System.out.println("8. Sacapuntas"); 
        System.out.println("9. volver");
        System.out.print("Escriba el numero de una opción: ");
        int mas = scanner.nextInt();
    }
    
    private static void elenuv(List<String> objetos){
        
    }
}
