package quinta.segunda;

public class Produto {

    private String marca;
    private String fabricante;
    private String codBarras;
    private float preco;

    public Produto() {
    }

    public Produto(String marca, String fabricante, String codBarras, float preco) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.codBarras = codBarras;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "marca='" + marca + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", codBarras='" + codBarras + '\'' +
                ", preco=" + preco +
                '}';
    }
}
