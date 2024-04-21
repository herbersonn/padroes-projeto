public class SorveteSimples implements Sorvete{
    public float preco;

    public SorveteSimples() {
    }
    public SorveteSimples(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {

        return preco;
    }

    @Override
    public String getIngrediente() {
        return "Simples";
    }
}
