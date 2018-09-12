public abstract class Assistente extends Funcionario {
    protected int numMatricula;


    public int getNumMatricula() {
        return numMatricula;
    }

    @Override
    public String toString() {
        return super.toString()     +
                "\nNumero da Matricula: " + numMatricula;
    }
}
