public abstract class SorveteDecorator implements Sorvete{

    private Sorvete sorvete;
    public String ingrediente;

    public SorveteDecorator(Sorvete sorvete){

        this.sorvete = sorvete;
    }

    public Sorvete getSorvete() {

        return sorvete;
    }

    public void setSorvete(Sorvete sorvete) {

        this.sorvete = sorvete;
    }

    public abstract float getPrecoSorvete();

    @Override
    public float getPreco(){
        return this.sorvete.getPreco() + ( this.getPrecoSorvete());
    }

    public abstract String getNomeSorvete();

    @Override
    public String getIngrediente() {
        return this.sorvete.getIngrediente() + "/" + this.getNomeSorvete();
    }

    public void setIngrediente(String ingrediente) {

        this.ingrediente = ingrediente;
    }

}
