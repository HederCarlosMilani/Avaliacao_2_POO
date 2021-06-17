
package caminhao_carro;


import avaliacao_2_poo.Veiculo;

/**
 *
 * @author VinciPy
 */
public class Carro extends Veiculo {
      public boolean portasFechadas;
       
    
       public void Ligar(){
           if (portasFechadas == true){
               ligado = true;
           } else {
               System.out.println("Portas abertas");
           }
       }
}
