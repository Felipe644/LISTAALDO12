public class AssistenteTecnico extends  Assistente{
    private float bonusSalarial;

    public void calcularSalario(){
        this.setSalario(this.getSalario()+this.getBonusSalarial());
    }

    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nBonus Salarial: " + bonusSalarial;
    }
}
