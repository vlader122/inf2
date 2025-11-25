import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DocumentoIdentidad ci = new DocumentoIdentidad();
        ci.nro = 12345678;
        ci.foto = "fotos/foto.png";
        ci.huella = "huella/huella.png";
        ci.femision = new Date("25/11/2025");
        ci.fvencimiento = new Date("25/11/2026");

        DocumentoIdentidad ciDocente = new DocumentoIdentidad();
        ciDocente.nro = 12345678;
        ciDocente.foto = "fotos/foto.png";
        ciDocente.huella = "huella/huella.png";
        ciDocente.femision = new Date("25/11/2025");
        ciDocente.fvencimiento = new Date("25/11/2026");

        Estudiante estudiante = new Estudiante("Niver Luis", "Copa Lopez", ci);
        Docente docente = new Docente("Pedro", "Ramirez",ciDocente);

        Documento tituloProvicion = new Documento(4512,"Titulo provicion nacional",new Date("02/05/2012"));
        Documento rni = new Documento(451112,"RNI",new Date("02/05/2012"));
        Documento diplomado = new Documento(212131231,"Diplomado",new Date("02/05/2012"));


        docente.documentos = new Documento[] {tituloProvicion,rni,diplomado};
        for (Documento documento : docente.documentos) {
            System.out.println(documento.getNombre());
        }
        estudiante.pagar_mensualidad();
        estudiante.calcular_codigo();
        docente.cobrar_sueldo();
        docente.calcular_codigo();
        System.out.println(estudiante.getNombres());
        System.out.println(docente.getNombres());

    }
}
