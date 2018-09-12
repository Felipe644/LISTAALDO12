public abstract class Funcionario {
    protected String nome;
    protected float salario;



    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nSalario: " + salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
