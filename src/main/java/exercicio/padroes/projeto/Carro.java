/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.padroes.projeto;

public abstract class Carro {
    static int vez = 1;
    private final String cor;
    public Carro(String cor){
        this.cor = cor;
    }
    
    private Velocidade velocidade;

    public void setVelocidade(Velocidade velocidade) {
	this.velocidade = velocidade;
    }
	
    public void mover() {
	velocidade.mover();
    }
    
    public String getCor(){ return cor; }
    public abstract void construir();
    
    public static Carro factory(String cor){
        switch(vez){
            case 1:
                vez = 2;
                return new CarroCorrida(cor);
            case 2:
                vez = 3;
                return new CarroForte(cor);
            default:
                vez = 1;
                return new CarroPasseio(cor);
        }
    }
}



