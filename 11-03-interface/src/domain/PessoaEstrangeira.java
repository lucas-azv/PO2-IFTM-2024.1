package domain;

public class PessoaEstrangeira implements Validavel{
        
    private Integer codigo;
    private String nome;
    private String passaporte;

    @Override
    public boolean valida(){
        boolean validaPassaporte = true;

        return validaPassaporte && validaDefault(nome);
    }
}
