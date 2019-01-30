package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        
        c1.setFabricante("Volkswagen");
        c1.setModelo("Gol");
        c1.setCor("Prata");
        c1.setAnoFabricacao(2017);        
        
        System.out.println("Fabricante: " + c1.getFabricante());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Ano: " + c1.getAnoFabricacao());        
    }    
}
