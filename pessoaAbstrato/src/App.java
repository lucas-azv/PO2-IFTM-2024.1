import domain.Pessoa;
import domain.PessoaFisica;
import domain.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa carlos = new PessoaFisica();
        Pessoa iftm = new PessoaJuridica();

        chamaValidacao(carlos);
        chamaValidacao(iftm);
    }

    private static void chamaValidacao(Pessoa pessoa){
        pessoa.valida();
    }
}
