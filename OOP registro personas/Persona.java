public class Persona {

    // atrbutos
    private String nombre;
    private String apellido;
    private int id;
    private int anioNacimiento;

    // constructor
    public Persona(String nombre, String apellido, int id, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.anioNacimiento = anioNacimiento;
    }

    // metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

}
