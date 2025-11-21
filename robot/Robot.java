public class Robot {
    private Integer vidas = 3;
    private Integer energia = 1;
    private String nick;
    private String estado;

    public Robot(String nickname){
        this.nick = nickname;
    }

    public Integer getVidas(){
        return this.vidas;
    }

    public Integer getEnergia(){
        return this.energia;
    }

    public String getNickname(){
        return this.nick;
    }

    public void cambiar_nombre(String newName){
        this.nick = newName;
    }

    public void atacar(Robot objetivo){
        System.out.println("vidas actuales "+ objetivo.getVidas());
        if(this.energia <=0){
            System.out.println("No hay energia suficiente, para atacar");
            return ; 
        }
        this.disminuir_energia();
        if(objetivo.estado == "Defendiendo"){
            objetivo.calcular_danio(0);
        }else{
            objetivo.calcular_danio(1);
        }
        System.out.println("Estoy atacando a:" + objetivo.getNickname());
        System.out.println("vidas actuales "+ objetivo.getVidas());
    }

    public void mover(){

    }

    public void defender(){
        this.estado = "Defendiendo";
    }

    public void calcular_danio(Integer puntos_ataque){
        this.vidas = this.vidas-puntos_ataque;
    }

    public void disminuir_energia(){
        if(this.energia <= 0){
            System.out.println("No hay energia suficiente");
        } else{
            this.energia = this.energia - 1;
        }
    }
}
