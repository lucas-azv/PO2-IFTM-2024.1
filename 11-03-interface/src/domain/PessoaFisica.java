package domain;

public class PessoaFisica implements Validavel{
    
    private Integer codigo;
    private String nome;
    private String cpf;

    @Override
    public boolean valida(){
        boolean validaCPF = true;

        return validaCPF && validaDefault(nome) && isPessoaRegular();
    }

    public boolean isPessoaRegular(){
        boolean chamaOSerasa = true;
        return chamaOSerasa;
    }
}
