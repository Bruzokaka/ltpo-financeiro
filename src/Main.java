public class Main {
    public static void main(String[] args) {
        GestorFinanceiro gestor = new GestorFinanceiro();

        gestor.AdicionarTransacao("Salário", 5000.0, Transacao.TipoTransacao.RECEITA);
        gestor.AdicionarTransacao("Freelance", 1200.0, Transacao.TipoTransacao.RECEITA);
        gestor.AdicionarTransacao("Aluguel", 1500.0, Transacao.TipoTransacao.DESPESA);
        gestor.AdicionarTransacao("Supermercado", 600.0, Transacao.TipoTransacao.DESPESA);
        gestor.AdicionarTransacao("Internet", 100.0, Transacao.TipoTransacao.DESPESA);

        gestor.listarTransacoes();

        System.out.printf("\nSaldo Final: %.2f\n", gestor.calcularSaldo());
    }
}
