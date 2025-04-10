public class ItemPedido {
    private String codigoProduto;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String codigoProduto, String descricao, int quantidade, double precoUnitario) {
        this.codigoProduto = codigoProduto;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }

    // Getters e setters
}
