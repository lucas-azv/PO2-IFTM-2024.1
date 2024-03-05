package domain;

public class PessoaEstrangeira extends Pessoa{
    
    private String passaporte;

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
