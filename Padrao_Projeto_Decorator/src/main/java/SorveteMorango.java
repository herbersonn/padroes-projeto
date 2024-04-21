public class SorveteMorango extends SorveteDecorator{
    public SorveteMorango(Sorvete sorvete){

        super(sorvete);
    }

    @Override
    public float getPrecoSorvete() {

        return 7.0f;
    }

    public String getNomeSorvete(){

        return "Morango";
    }

}
