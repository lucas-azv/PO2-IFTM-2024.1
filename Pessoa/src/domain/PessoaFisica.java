package domain;

public class PessoaFisica extends Pessoa{
    
    private String cpf;

    @Override
    public boolean valida(){
        super.valida();
        //valida cpf
        return true;
        //TODO
    }

    @Override
    protected abstract boolean validaFilho(){
        return true;
    }
}
