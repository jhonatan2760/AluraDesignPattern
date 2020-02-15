package chainresposability;

public class DescontoPorMaisDeQuintos implements Desconto {

    Desconto desconto;

    @Override
    public double desconta(Orcamento orcamento) {
        if(orcamento.getValor() > 500){
            System.out.println("Ganhou desconto por valor");
            return orcamento.getValor() * 0.20;
        }else{
            System.out.println("não Ganhou desconto por valor");
            return this.desconto.desconta(orcamento);
        }
        
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.desconto = desconto;
    }

}