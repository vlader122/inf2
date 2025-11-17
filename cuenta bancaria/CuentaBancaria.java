public class CuentaBancaria {
    private Double saldo = 0.0;
    protected String nro_cuenta;
    public String titular;
    public Boolean estado = true;
    private Integer limite = 3000;

    public void depositar (Double deposito){
        if(this.estado == false){
            System.out.println("No se admiten depositos en la cuenta");
            return ;
        }
        if(deposito > 0){
            this.saldo = this.saldo + deposito;
            System.out.println(this.saldo);
        } else{
            System.out.println("No se permiten saldos negativos");
        }
    }

    public void retiro(Double retiro){

        if(retiro<0){
            System.out.println("No se permiten saldos negativos");
            return;
        }

        if( retiro > this.limite){
            System.out.println("Limite de retiro excedido");
            return;
        }

        if(retiro <= this.saldo){
            this.saldo = this.saldo - retiro;
            if(this.saldo == 0.0){
                this.estado = false;
                System.out.println("se cerro");
            }
            System.out.println(this.saldo);
        } else {
            System.out.println("No puedes retirar mas dinero de lo que tienes");
        }
    }
    
    public void aumentarLimite(Integer incremento){
        this.limite = incremento;
    }
}
