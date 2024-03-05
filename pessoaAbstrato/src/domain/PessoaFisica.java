package domain;

public class PessoaFisica extends Pessoa{
    
    private String cpf;

    @Override
    protected boolean validaAbstract(){
        boolean validaCpf = true;

        return validaCpf;
    }
}
