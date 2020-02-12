package strategy;

public class TesteCalculoImposto {

    public static void main(String [] args){
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

        Orcamento orcamento = new Orcamento(500.0);

        double res = calculadoraDeImposto.calculaImposto(orcamento, new Icms());
        
        System.out.println(res);
    }

}