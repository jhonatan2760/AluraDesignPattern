package src.chainresposability;
;

public class CalculadoraDeDescontos {

    public double calcula(Orcamento orcamento){
        
        Desconto descontoItens = new DescontoCincoItens();
        Desconto descontoMais = new DescontoPorMaisDeQuintos();
        Desconto semDesconto = new SemDesconto();

        descontoItens.setProximo(descontoMais);
        descontoMais.setProximo(semDesconto);

        return descontoItens.desconta(orcamento);
    }


}