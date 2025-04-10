import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private LocalDateTime dataHora;
    private Vendedor vendedor;
    private Cliente cliente;
    private StatusPedido status;
    private List<ItemPedido> itens;
    private double desconto; // percentual, ex: 10.0 = 10%

    public Pedido(String id, Vendedor vendedor, Cliente cliente) {
        this.id = id;
        this.dataHora = LocalDateTime.now();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.status = StatusPedido.EM_PROCESSAMENTO;
        this.itens = new ArrayList<>();
        this.desconto = 0.0;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        if (desconto > 0) {
            total -= (total * desconto / 100.0);
        }
        return total;
    }

    public void aplicarDesconto(double percentual) {
        this.desconto = percentual;
    }

    public void atualizarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    // Getters e setters
}
