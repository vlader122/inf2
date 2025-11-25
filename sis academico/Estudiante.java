public class Estudiante extends Persona{

    private Double mensualidad = 600.0;

	public Estudiante(String nombres, String apellidos, DocumentoIdentidad ci) {
		super(nombres, apellidos, ci);
	}

    public void pagar_mensualidad(){
        System.out.println("Pago correcto");
    };

}
