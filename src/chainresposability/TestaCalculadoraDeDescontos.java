package src.chainresposability;

import java.util.Arrays;

public class TestaCalculadoraDeDescontos {

    public static void main(String [] args){
        Orcamento orcamento = new Orcamento(900.0);

        Item it = new Item("Lápis", 150);
        Item its = new Item("Dvd Kiss", 10);

        orcamento.setItens(Arrays.asList(it, its, it, it, it, it));
        
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        double valorOrcamento = calculadoraDeDescontos.calcula(orcamento);

        System.out.println("Valor do orçamento : "+valorOrcamento);
    }

}