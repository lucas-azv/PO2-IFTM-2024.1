package domain;

public class PessoaJuridica implements Validavel {

    private Integer codigo;
    private String nome;
    private String cpnj;

    @Override
    public boolean valida() {
        return validaDefault(nome) && isPessoaRegular();
    }

    public boolean isPessoaRegular() {
        return true;
    }
}
