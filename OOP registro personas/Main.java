public class Main {
    public static void main(String[] args) {

        ArregloPersona arregloPersona = new ArregloPersona();

        arregloPersona.agregarPersona();

        arregloPersona.imprimir();

        arregloPersona.buscarId();

        arregloPersona.buscarAnioNacimiento();

        System.out.println("_______________________________________________________________");

        System.out.println(" MODIFICAR ATRIBUTOS");

        arregloPersona.modificarAtributos();

        arregloPersona.imprimir();

    }
}