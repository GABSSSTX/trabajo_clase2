import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static ArrayList<ArrayList<Object>> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {

                case 1: {  // CREAR
                    System.out.println("ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Email:");
                    String email = sc.nextLine();

                    CRUD.crearUsuario(new Usuario(id, nombre, email));
                    break;
                }

                case 2: {  // LEER
                    CRUD.leerUsuarios();
                    break;
                }

                case 3: {  // ACTUALIZAR
                    System.out.println("ID del usuario a actualizar:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nuevo nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Nuevo email:");
                    String email = sc.nextLine();

                    CRUD.actualizarUsuario(new Usuario(id, nombre, email));
                    break;
                }

                case 4: {  // ELIMINAR
                    System.out.println("ID del usuario a eliminar:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    CRUD.eliminarUsuario(id);
                    break;
                }

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

            System.out.println();

        } while (opcion != 5);

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("=== Biblioteca: Gestión de usuarios ===");
        System.out.println("1. Crear usuario");
        System.out.println("2. Leer usuarios");
        System.out.println("3. Actualizar usuario");
        System.out.println("4. Eliminar usuario");
        System.out.println("5. Salir");
    }

    static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }
}