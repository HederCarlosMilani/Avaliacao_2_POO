
package avaliacao_2_poo;


public abstract class Veiculo {
    public Veiculo(boolean ligado, String marca, String modelo, int marcha, int qtdeMarcas){
        this.ligado = ligado;
        this.marca = marca;
        this.modelo = modelo;
        this.marcha = marcha;
        this.qtdeMarchas = qtdeMarcas;
    }
    
    public boolean ligado;
    public String marca, modelo;
    public int marcha, qtdeMarchas;
    
    public boolean ligado(){
      return ligado == true;
    }
    public boolean desligado(){
        return ligado == false;
    }
    public void marchaAbaixo(){
      if(marcha > 0){
       marcha--;
      }
      else{
         System.out.println("Não pode mais reduzir a marcha");
      }
    }
     public void marchaAcima(){
        if (marcha < qtdeMarchas) {
            marcha ++;
        }
        else {
            System.out.println("Marcha máxima atingida.");
        }
     }
}
