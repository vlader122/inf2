public class Docente extends Persona {

    public Documento[] documentos;
	public Docente(String nombres, String apellidos, DocumentoIdentidad ci) {
		super(nombres, apellidos, ci);
	}

    public void cobrar_sueldo(){
        System.out.println("Sueldo cobrado");
    }
}
