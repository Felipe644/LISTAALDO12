public abstract class Produto {
    protected String nomeLoja;
    protected  float preco;
    protected String descricao;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return "Produto de informática";
    }

    @Override
    public String toString() {
        return
                "\nNomeLoja: " + nomeLoja +
                "\nPreco: " + preco +
                "\nDescricao: " + descricao ;
    }
}
