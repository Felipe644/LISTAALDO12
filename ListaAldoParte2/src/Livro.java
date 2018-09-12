public class Livro extends  Produto{
    private String autor;

    public Livro(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAutor: " + autor ;
    }

    @Override
    public String getDescricao() {
        return autor;
    }
}
