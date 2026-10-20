package entities;

public class Products {
   private String name;
   private Double valor;
   private Integer quantidade;


   public Products(){}

    public Products(String name, Double valor, Integer quantidade) {
        this.name = name;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double soma(){
        return getValor() * getQuantidade();
    }



}
