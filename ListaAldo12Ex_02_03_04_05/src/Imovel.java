public abstract class Imovel {
    protected String endereco;
    protected float preco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return
                "\nEndereço: " + endereco +
                "\nPreço: " + preco;
    }
}
