import java.util.Date;

public class Documento {
    private Integer nro;
    private String nombre;
    private Date femision;

    public Documento(Integer nro, String nombre, Date femision){
        this.nro = nro;
        this.femision = femision;
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}
