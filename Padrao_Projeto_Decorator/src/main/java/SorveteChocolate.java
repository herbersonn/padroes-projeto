public class SorveteChocolate extends SorveteDecorator{
    public SorveteChocolate(Sorvete sorvete){
        super(sorvete);
    }

    @Override
    public float getPrecoSorvete() {
        return 10.0f;
    }

    public String getNomeSorvete(){
        return "Chocolate";
    }
}
