
package avaliacao_2_poo;


public abstract class Veiculo {
    public Veiculo(boolean ligado, String marca, String modelo, int marcha, int qtdeMarcas){
        this.ligado = ligado;
        this.marca = marca;
        this.modelo = modelo;
        this.marcha = marcha;
        this.qtdeMarchas = qtdeMarcas;
    }
    
    private boolean ligado;
    private String marca, modelo;
    private int marcha, qtdeMarchas;
    
    public boolean ligado(){
      return ligado == true;
    }
    public boolean desligado(){
        return ligado == false;
    }
    
    public void getLigado(){
        System.out.println(this.ligado);
    }
   
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    public void getMarca(){
        System.out.println(this.marca);
    }
    
    public void getModelo(){
        System.out.println(this.modelo);
    }
    
    public void getMarcha(){
        System.out.println(this.marcha);
    }
    
     public void qtdeMarchas(){
        System.out.println(this.qtdeMarchas);
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
