
package caminhao_carro;


import avaliacao_2_poo.Veiculo;

/**
 *
 * @author VinciPy
 */
public class Carro extends Veiculo {
      private boolean portasFechadas;

    public Carro(boolean ligado, String marca, String modelo, int marcha, int qtdeMarcas, boolean portasFechadas) {
        super(ligado, marca, modelo, marcha, qtdeMarcas);
        this.portasFechadas = portasFechadas;
    }
       
    
       public void Ligar(){
           if (portasFechadas == true){
               super.setLigado(true);
           } else {
               System.out.println("Portas abertas -- Fechar Portas");
               super.setLigado(false);
           }
       }
       
       public boolean getPortasFechadas(){
          return this.portasFechadas;
       }
}
