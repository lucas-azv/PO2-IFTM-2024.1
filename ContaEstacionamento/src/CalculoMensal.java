import java.time.Duration;

public class CalculoMensal implements CalculoValor{

    public Double calcularValor(Duration duracao, Veiculo veiculo){
        long horas = duracao.toHours();
        long dias = horas / 24;
        dias = dias + ((horas % 24 == 0) ? 0 : 1);
        long meses = dias/30;
        meses = meses + ((dias % 30 == 0) ? 0 : 1);
        return meses * 300.0;
    }
}