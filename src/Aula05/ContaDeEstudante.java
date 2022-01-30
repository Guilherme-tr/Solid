package Aula05;

public class ContaDeEstudante extends ContaComum{
    private int milhas;
    private ManipuladorDeSaldo m;

    public ContaDeEstudante(){
        m = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        m.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }

}
