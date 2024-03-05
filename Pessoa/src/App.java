import domain.Pessoa;
import domain.PessoaEstrangeira;
import domain.PessoaFisica;
import domain.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa pessoa1 = new PessoaFisica();
        // Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new PessoaJuridica();
        Pessoa pessoa4 = new PessoaEstrangeira();

        pessoa1.valida();
        pessoa2.valida();
        pessoa3.valida();
        pessoa4.valida();
    }
}