package domain;

public class PessoaJuridica implements Validavel{
    
    private Integer codigo;
    private String nome;
    private String cpnj;

    @Override
    public boolean valida(){
        boolean validaCnpj = true;

        return validaCnpj && validaDefault(nome) && isPessoaRegular();
    }

    public boolean isPessoaRegular(){
        boolean chamaReceitaFederal = true;
        return chamaReceitaFederal;
    }
}
