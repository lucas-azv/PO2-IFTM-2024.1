package domain;

public class PessoaJuridica extends Pessoa{
    
    private Integer cnpj;

    @Override
    public boolean valida(){
        super.valida();
        //valida cnpj
        return true;
        //TODO
    }

    @Override
    protected abstract boolean validaFilho(){
        return true;
    }
}