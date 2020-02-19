package src.chainresposability;


import java.util.Collections;
import java.util.List;

public class Orcamento {

    private Double valor;
    private List<Item> itens;

    public Orcamento(Double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return this.valor;
    }

    public List<Item> getItens(){
        return Collections.unmodifiableList(this.itens);
    }

    public void setItens(List<Item> itens){
        this.itens = itens;
    }

}