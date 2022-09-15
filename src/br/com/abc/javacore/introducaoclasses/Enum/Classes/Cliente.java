package br.com.abc.javacore.introducaoclasses.Enum.Classes;

public class Cliente {

    public enum TipoPagamento{
        AVISTA,APRAZO
    }

    private String nome;
    private TipoPagamento tipoPagamento;
    private TipoCliente tipoCliente;

    public Cliente() {
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }



    public String toString(){
        return "Nome: "+nome+ " Tipo pessoa: " + tipoCliente.getNome() + " Tipo pagamento " + tipoPagamento + " tipo: "+ tipoCliente.getTipo();
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
