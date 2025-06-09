/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.padroes.projeto;

public class CarroPasseio extends Carro {

    public CarroPasseio(String cor) {
        super(cor);
    }
    @Override
    public void construir() {
        System.out.println("Construindo Pick-up da cor "+getCor());
    }
}
