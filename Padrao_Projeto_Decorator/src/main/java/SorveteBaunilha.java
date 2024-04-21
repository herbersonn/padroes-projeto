public class SorveteBaunilha extends SorveteDecorator{
    public SorveteBaunilha(Sorvete sorvete){

        super(sorvete);
    }

    @Override
    public float getPrecoSorvete() {
        return 5.0f;
    }

    public String getNomeSorvete(){
        return "Baunilha";
    }
}
