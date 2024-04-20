import java.util.Random;

public class Conta {
    Usuario usuario;
    private int id;
    private double saldo;
    public String tipo;

    Conta (){

    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(){
        usuario = new Usuario();
    }

    public void setId(){
        this.id = new Random().nextInt(100);
    }
    public int getId(){
        return id;
    }

    public void transfer(String name ,double valor, Usuario user){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente");
        }else{

           this.saldo -= valor;

           user.getContaObj().saldo+= valor;
        }
    }

    public void deposito(double valor){
        setSaldo( this.saldo += valor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        this.saldo += valor;
    }
}
