import java.util.Arrays;
import java.util.List;

import domain.PessoaEstrangeira;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Validavel;

public class App {
    public static void main(String[] args) throws Exception {
        Validavel carlos = new PessoaFisica();
        Validavel iftm = new PessoaJuridica();
        Validavel lewisHamilton = new PessoaEstrangeira();

        List<Validavel> pessoas = Arrays.asList(carlos,iftm,lewisHamilton);

        for(Validavel pessoa:pessoas){
            chamaValidacao(pessoa);
        }
    }

    private static void chamaValidacao(Validavel pessoa){
        pessoa.valida();
    }
}
