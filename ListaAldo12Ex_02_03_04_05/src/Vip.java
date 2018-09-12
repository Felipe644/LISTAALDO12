public class Vip extends Ingresso {
    private float valorAdicional;

    public void valorIngressoVip(){
        this.setValorIngresso(this.getValorIngresso()+this.getValorAdicional());
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nValor Adicional: " + valorAdicional;
    }
}
