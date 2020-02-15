package chainresposability;

public class DescontoCincoItens implements Desconto {

    Desconto desconto;

    @Override
    public double desconta(Orcamento orcamento){
        if(orcamento.getItens().size() > 5){
            System.out.println("Ganhou desconto por quantidade de itens");
           return orcamento.getValor() * 0.1; 
        }else{
            System.out.println("Não Ganhou desconto por quantidade de itens");
            return this.desconto.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto desconto){
        this.desconto = desconto;
    }
    

}