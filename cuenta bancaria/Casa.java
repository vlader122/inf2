public class Casa {
    private String descripcion;
    private Double superficie;
    private Double precio = 0.0;
    private Integer habitaciones;

    public Casa(){
        
    }

    public Casa(String descripcion, Double superficie){
        habitaciones = 10;
        this.descripcion = descripcion;
        this.superficie = superficie;
    }

    public Casa(String descripcion, Double superficie, Integer habitaciones){
        this.descripcion = descripcion;
        this.superficie = superficie;
        this.habitaciones = habitaciones;
    }

    public void calcular_precio(Double preciom2){
        precio = superficie * preciom2;
    }

    public void setDescripcion(String nuevo){
        this.descripcion = nuevo;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setPrecio(Double precio){
        this.precio = precio;
    }

    public Double getPrecio(){
        return this.precio;
    }

    public void setHabitaciones(Integer habitaciones){
        if(habitaciones > 0){
            this.habitaciones = habitaciones;
        }
    }

    public Integer getHabitaciones(){
        return this.habitaciones;
    }

    public String calcular_plusvalia(int rango, Double ajuste){
        Double precio_pluvalia = (precio * rango) - ajuste;
        String recomendacion = "";
        if(precio_pluvalia > (precio + ajuste)){
            recomendacion = "Buena plusvalia";
        }else if(precio_pluvalia == precio){
            recomendacion = "Regular";
        } else {
            recomendacion = "Mala inversion";
        }
        return recomendacion;
    }
}
