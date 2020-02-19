package src.strategy;

public class CalculadoraDeImposto {

    public double calculaImposto(Orcamento orcamento, Imposto imposto){
        return imposto.calcula(orcamento);
    }

}