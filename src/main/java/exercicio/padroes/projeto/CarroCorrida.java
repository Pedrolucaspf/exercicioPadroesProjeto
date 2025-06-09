/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.padroes.projeto;

public class CarroCorrida extends Carro {

    public CarroCorrida(String cor) {
        super(cor);
    }

    @Override
    public void construir() {
        System.out.println("Construindo carro Sedan da cor "+getCor());
    }
}
