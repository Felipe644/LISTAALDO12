public class Velho extends Imovel {
    private float desconto;
    public void valorVelho(){
        this.setPreco(this.getPreco() - this.getDesconto());
        System.out.println(this.getPreco());
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nDesconto: " + desconto;
    }
}
