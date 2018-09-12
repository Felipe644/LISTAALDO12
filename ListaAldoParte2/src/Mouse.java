public class Mouse extends Produto {
        private String tipo;

    public Mouse(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTipo: " + tipo ;

    }

    @Override
    public String getDescricao() {
        return tipo;
    }
}
