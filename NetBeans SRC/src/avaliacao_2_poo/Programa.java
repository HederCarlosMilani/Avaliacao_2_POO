/*
    Heder Carlos Milani - 00134684
*/
package avaliacao_2_poo;

import caminhao_carro.Caminhao;
import caminhao_carro.Carro;
import caminhao_carro.Motocicleta;

public class Programa {

    public static void main(String[] args) {
        Carro c1 = new Carro(true, "Tesla", "Model Y", 2, 6, false);
        Carro c2 = new Carro(false, "Fiat", "Uno", 1, 6, true);
        
        Caminhao cam1 = new Caminhao(false, "Scania", "v8", 3, 12, true);
        Caminhao cam2 = new Caminhao(true, "Scania", "v9", 10, 18, false);
        
        Motocicleta mo2 = new Motocicleta(true, "Honda", "CG160", 2, 5);
        Motocicleta mo1 = new Motocicleta(false, "Honda", "CG150", 3, 5);
        
      
        c1.ligado();
        c1.desligado();
        c1.getLigado();
        c1.setLigado(true);
        c1.getMarca();
        c1.getModelo();
        c1.getMarcha();
        c1.qtdeMarchas();
        c1.marchaAbaixo();
        c1.marchaAcima();
        c1.getPortasFechadas();
        
        c2.ligado();
        c2.desligado();
        c2.getLigado();
        c2.setLigado(true);
        c2.getMarca();
        c2.getModelo();
        c2.getMarcha();
        c2.qtdeMarchas();
        c2.marchaAbaixo();
        c2.marchaAcima();
        c2.getPortasFechadas();
        
      
        cam1.ligado();
        cam1.desligado();
        cam1.getLigado();
        cam1.setLigado(true);
        cam1.getMarca();
        cam1.getModelo();
        cam1.getMarcha();
        cam1.qtdeMarchas();
        cam1.marchaAbaixo();
        cam1.marchaAcima();
        cam1.getPortasFechadas();
        
        cam2.ligado();
        cam2.desligado();
        cam2.getLigado();
        cam2.setLigado(true);
        cam2.getMarca();
        cam2.getModelo();
        cam2.getMarcha();
        cam2.qtdeMarchas();
        cam2.marchaAbaixo();
        cam2.marchaAcima();
        cam2.getPortasFechadas();
        
        
        mo1.ligado();
        mo1.desligado();
        mo1.getLigado();
        mo1.setLigado(true);
        mo1.getMarca();
        mo1.getModelo();
        mo1.getMarcha();
        mo1.qtdeMarchas();
        mo1.marchaAbaixo();
        mo1.marchaAcima();
        
        mo2.ligado();
        mo2.desligado();
        mo2.getLigado();
        mo2.setLigado(true);
        mo2.getMarca();
        mo2.getModelo();
        mo2.getMarcha();
        mo2.qtdeMarchas();
        mo2.marchaAbaixo();
        mo2.marchaAcima();
        
        imprimir(c1);
        imprimir(c2);
        imprimir(cam1);
        imprimir(cam2);
        imprimir(mo1);
        imprimir(mo2);
        
    }
    
    public static void imprimir(Veiculo veiculo){
        System.out.println(veiculo.getMarca());
        System.out.println(veiculo.getModelo());
        System.out.println(veiculo.getLigado());
        System.out.println(veiculo.getMarcha());
    }
}
