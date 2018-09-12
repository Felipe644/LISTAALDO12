public abstract class Ingresso {
    protected float valorIngresso;

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    @Override
    public String toString() {
        return
                "\nValor do Ingresso: " + valorIngresso ;
    }
}
