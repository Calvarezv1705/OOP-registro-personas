import java.util.Scanner;
import java.util.ArrayList;

public class ArregloPersona {

    // atributos
    private ArrayList<Persona> arr;

    // constructor
    public ArregloPersona() {
        arr = new ArrayList<>();
    }

    // metodos
    public void agregarPersona() {
        Scanner teclado = new Scanner(System.in);

        int count = 1;

        System.out.println("ingrese el nombre de la persona " + count);
        String nombre = teclado.nextLine();

        while (nombre.equals("terminar") != true || arr.size() == 10) {

            System.out.println("________________________________________________________");

            System.out.println("ingrese el primer apellido");
            String apellido = teclado.next();

            System.out.println("________________________________________________________");

            System.out.println("ingrese el id");
            int id = teclado.nextInt();

            System.out.println("________________________________________________________");

            System.out.println("ingrese el año de nacimiento");
            int anioNacimiento = teclado.nextInt();

            Persona persona = new Persona(nombre, apellido, id, anioNacimiento);

            arr.add(persona);
            count++;

            System.out.println("________________________________________________________");

            System.out.println("ingrese el nombre de la persona " + count
                    + " cuando no desee agregar mas personas ponga:'terminar'");
            teclado.nextLine();
            nombre = teclado.nextLine();
        }
    }

    public void imprimir() {
        int n = arr.size();

        for (int i = 0; i < n; i++) {

            Persona persona = arr.get(i);

            System.out.println("________________________________________________________");

            System.out.println("persona " + (i + 1));
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Id: " + persona.getId());
            System.out.println("Años de nacimiento: " + persona.getAnioNacimiento());
        }
    }

    public void buscarId() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("________________________________________________________");

        System.out.println("ingrese el id de la persona que desea buscar");
        int buscarId = teclado.nextInt();

        System.out.println("________________________________________________________");

        int n = arr.size();

        for (int i = 0; i < n; i++) {
            Persona persona = arr.get(i);
            int id = persona.getId();
            if (buscarId == id) {

                System.out.println("persona " + (i + 1));

                System.out.println("________________________________________________________");

                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Apellidp: " + persona.getApellido());
                System.out.println("Id: " + persona.getId());
                System.out.println("Años de nacimiento: " + persona.getAnioNacimiento());
            }
        }
    }

    public void buscarAnioNacimiento() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("________________________________________________________");

        System.out.println("ingrese el año de nacimiento de la persona que desea buscar");
        int buscarAnioNacimiento = teclado.nextInt();

        System.out.println("________________________________________________________");

        int n = arr.size();

        for (int i = 0; i < n; i++) {
            Persona persona = arr.get(i);
            int anioNacimiento = persona.getAnioNacimiento();
            if (buscarAnioNacimiento == anioNacimiento) {

                System.out.println("persona " + (i + 1));

                System.out.println("________________________________________________________");

                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Apellido: " + persona.getApellido());
                System.out.println("Id: " + persona.getId());
                System.out.println("Años de nacimiento: " + persona.getAnioNacimiento());
            }
        }
    }

    public void modificarAtributos() {
        Scanner teclado = new Scanner(System.in);

        int n = arr.size();

        for (int i = 0; i < n; i++) {

            Persona persona = arr.get(i);

            System.out.println("________________________________________________________");

            System.out.println("persona " + (i + 1));
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Id: " + persona.getId());
            System.out.println("Años de nacimiento: " + persona.getAnioNacimiento());

        }

        System.out.println("________________________________________________________");

        System.out.println("ingresa el numero de la persona que deseas modificar");
        int numPersona = teclado.nextInt();
        numPersona = numPersona - 1;

        for (int i = 0; i < n; i++) {
            if (numPersona == i) {
                Persona persona = arr.get(i);

                System.out.println("________________________________________________________");

                System.out.println("ingresa el nuevo nombre de la persona");
                teclado.nextLine();
                String nombre = teclado.nextLine();
                persona.setNombre(nombre);

                System.out.println("________________________________________________________");

                System.out.println("ingresa el nuevo apellido");
                String apellido = teclado.next();
                persona.setApellido(apellido);

                System.out.println("________________________________________________________");

                System.out.println("ingresa el nuevo id");
                int id = teclado.nextInt();
                persona.setId(id);

                System.out.println("________________________________________________________");

                System.out.println("ingresa el nuevo año de nacimiento");
                int anioNacimiento = teclado.nextInt();
                persona.setAnioNacimiento(anioNacimiento);
            }
        }
    }
}