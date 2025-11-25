public class Persona {
    private String nombres;
    private String apellidos;
    private DocumentoIdentidad ci;
    private String telefono;
    private String direccion;

    public Persona (String nombres, String apellidos, DocumentoIdentidad ci){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ci = ci;
    }

    public Persona (String nombres, String apellidos, DocumentoIdentidad ci, String telefono, String direccion){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ci = ci;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombres(){
        return this.nombres;
    }

    public void calcular_codigo(){
        System.out.println(this.nombres + this.ci);
    }
}
