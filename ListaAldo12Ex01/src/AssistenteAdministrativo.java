public class AssistenteAdministrativo extends Assistente {
    private float adicionalNoturno;
    private boolean turnoNoturno;

    public void calcularSalario(){
        if(this.gatTurnoNoturno()){
            this.setSalario(this.getSalario()+this.getAdicionalNoturno());
        }
    }

    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public boolean gatTurnoNoturno() {
        return turnoNoturno;
    }

    public void setTurnoNoturno(boolean turnoNoturno) {
        this.turnoNoturno = turnoNoturno;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAdicional Noturno: " + adicionalNoturno +
                "\nTurnoNoturno: " + turnoNoturno;
    }
}
