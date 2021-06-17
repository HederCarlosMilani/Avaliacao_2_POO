
package caminhao_carro;

import avaliacao_2_poo.Veiculo;

/**
 *
 * @author VinciPy
 */
public class Caminhao extends Veiculo {
       public boolean portasFechadas;

    public Caminhao(boolean ligado, String marca, String modelo, int marcha, int qtdeMarcas) {
        super(ligado, marca, modelo, marcha, qtdeMarcas);
    }
       
       public void Ligar(){
           if (portasFechadas == true){
               ligado = true;
           } else {
               System.out.println("Portas abertas");
           }
       }
}
