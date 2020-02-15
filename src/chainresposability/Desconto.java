package chainresposability;

public interface Desconto {

    public double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
    
}