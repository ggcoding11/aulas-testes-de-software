import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.aula03.CalculadoraFrete;

public class CalculadoraFreteTest {
    CalculadoraFrete calculadoraFrete;
    
    @BeforeEach
    public void preparar() {
        calculadoraFrete = new CalculadoraFrete();
    }

    @Test
    public void deveCobrarFrete() {
        double frete = calculadoraFrete.calcular(0, false);

        Assertions.assertEquals(20.0, frete);
    }

    @Test
    public void deveTerFreteGratisComClientePremium() {
        double frete = calculadoraFrete.calcular(0, true);

        Assertions.assertEquals(0.0, frete);
    }

    @Test
    public void deveTerFreteGratisComValorMaiorOuIgualaDuzentos() {
        double frete = calculadoraFrete.calcular(200.0, true);

        Assertions.assertEquals(0.0, frete);
    }
}
