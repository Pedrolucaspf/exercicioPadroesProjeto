/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.padroes.projeto;

public class Main {
    public static void main(String[] args) {
	Carro carro;
        int r;
        for(int i=0; i < 10; i++){
            carro = Carro.factory("Branco");
            carro.construir();
            r = i%3;
            switch(r){
                case 0:
                    carro.setVelocidade(new VelocidadeAlta());
                    break;
                case 1:
                    carro.setVelocidade(new VelocidadeMedia());
                    break;
                case 2:
                    carro.setVelocidade(new VelocidadeBaixa());
                    break;
            }
            carro.mover();
        }
    }
}
