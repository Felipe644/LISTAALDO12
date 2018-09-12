public class Novo extends Imovel {
    private  float adicional;
    public void ValorNovo(){
        this.setPreco(this.getPreco()+this.getAdicional());
        System.out.println(this.getPreco());
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAdicional: " + adicional;
    }
}
