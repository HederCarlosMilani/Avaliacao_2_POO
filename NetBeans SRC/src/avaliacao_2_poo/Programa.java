/*
    Heder Carlos Milani - 00134684
*/
package avaliacao_2_poo;

import caminhao_carro.Caminhao;
import caminhao_carro.Carro;

public class Programa {

    public static void main(String[] args) {
        Carro c1 = new Carro(true, "Tesla", "Model Y", 2, 6, false);
        c1.Ligar();
        c1.getLigado();
    }
    
}
