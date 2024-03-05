package domain;

public abstract class Pessoa {
    
    private Integer codigo;
    private String nome;

    public boolean valida(){
        return true;
    }

    protected abstract boolean validaFilho();

    public boolean validaPessoa(){
        return valida() && validaFilho();
    }
}
