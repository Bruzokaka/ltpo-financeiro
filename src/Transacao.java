import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private String descricao;
    private double valor;
    private TipoTransacao tipo;

    public enum TipoTransacao {
        RECEITA, DESPESA
    }

    public void exibirTransacao() {
        System.out.printf("Descrição: %s | Valor: R$ %.2f | Tipo: %s\n", descricao, valor, tipo);
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }


    public Transacao(String descricao, double valor, TipoTransacao tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }
}
