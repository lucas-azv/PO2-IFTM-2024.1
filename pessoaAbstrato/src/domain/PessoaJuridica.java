package domain;

public class PessoaJuridica extends Pessoa{
    
    private String cpf;

    @Override
    protected boolean validaAbstract(){
        boolean validaCnpj = true;

        return validaCnpj;
    }
}
