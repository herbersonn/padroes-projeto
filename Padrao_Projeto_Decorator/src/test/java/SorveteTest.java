import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SorveteTest {
    @Test
    void deveRetornarPrecoDoSorvete(){
        Sorvete sorvete = new SorveteSimples(3.00f);
        assertEquals(3.00f, sorvete.getPreco());
    }

    @Test
    void deveRetornarPrecoDoSorveteBaunilha() {
        Sorvete sorvete = new SorveteBaunilha(new SorveteSimples(3.00f));
        assertEquals(8.00f, sorvete.getPreco());
    }

    @Test
    void deveRetornarPrecoDoSorveteMorango() {
        Sorvete sorvete = new SorveteMorango(new SorveteSimples(3.00f));
        assertEquals(10.00f, sorvete.getPreco());
    }

    @Test
    void deveRetornarPrecoDoSorveteChocolate() {
        Sorvete sorvete = new SorveteChocolate(new SorveteSimples(3.00f));
        assertEquals(13.00f, sorvete.getPreco());
    }


    @Test
    void deveRetornarPrecoDoSOrveteMorangoEBAunilha() {
        Sorvete sorvete = new SorveteMorango(new SorveteBaunilha(new SorveteSimples(3.00f)));
        assertEquals(15.00f, sorvete.getPreco());
    }

    @Test
    void deveRetornarPrecoDoSOrveteBaunilhaEChocolate() {
        Sorvete sorvete = new SorveteBaunilha(new SorveteChocolate(new SorveteSimples(3.00f)));
        assertEquals(18.00f, sorvete.getPreco());
    }

    @Test
    void deveRetornarPrecoDoSOrveteMorangoEChocolate() {
        Sorvete sorvete = new SorveteMorango(new SorveteChocolate(new SorveteSimples(3.00f)));
        assertEquals(20.00f, sorvete.getPreco());
    }

    @Test
    void deveRetornarPrecoDoSOrveteMorangoChocolateEBaunilha() {
        Sorvete sorvete = new SorveteMorango(new SorveteChocolate(new SorveteBaunilha(new SorveteSimples(3.00f))));
        assertEquals(25.00f, sorvete.getPreco());
    }


    @Test
    void deveRetornarIngredienteDoSorvete() {
        Sorvete sorvete = new SorveteSimples(3.00f);
        assertEquals("Simples", sorvete.getIngrediente());
    }


    @Test
    void deveRetornarIngredienteDoSorveteBaunilha() {
        Sorvete sorvete = new SorveteBaunilha(new SorveteSimples(3.00f));
        assertEquals("Simples de Baunilha", sorvete.getIngrediente());
    }

    @Test
    void deveRetornarIngredienteDoSorveteMorango() {
        Sorvete sorvete = new SorveteMorango(new SorveteSimples(3.00f));
        assertEquals("Simples de Morango", sorvete.getIngrediente());
    }

    @Test
    void deveRetornarIngredienteDoSorveteChocolate() {
        Sorvete sorvete = new SorveteChocolate(new SorveteSimples(3.00f));
        assertEquals("Simples de Chocolate", sorvete.getIngrediente());
    }

    @Test
    void deveRetornarIngredienteDoSOrveteMorangoEBAunilha() {
        Sorvete sorvete = new SorveteMorango(new SorveteBaunilha(new SorveteSimples(3.00f)));
        assertEquals("Morango e Baunilha", sorvete.getIngrediente());
    }

    @Test
    void deveRetornarIngredienteDoSOrveteBaunilhaEChocolate() {
        Sorvete sorvete = new SorveteBaunilha(new SorveteChocolate(new SorveteSimples(3.00f)));
        assertEquals("Baunilha e Chocolate", sorvete.getIngrediente());
    }

    @Test
    void deveRetornarIngredienteDoSOrveteMorangoEChocolate() {
        Sorvete sorvete = new SorveteMorango(new SorveteChocolate(new SorveteSimples(3.00f)));
        assertEquals("Morango e Chocolate", sorvete.getIngrediente());
    }

    @Test
    void deveRetornarIngredienteDoSorveteMorangoChocolateEBaunilha() {
        Sorvete sorvete = new SorveteMorango(new SorveteChocolate(new SorveteBaunilha(new SorveteSimples(3.00f))));
        assertEquals("Morango, Chocolate e Baunilha", sorvete.getIngrediente());
    }
    
}
