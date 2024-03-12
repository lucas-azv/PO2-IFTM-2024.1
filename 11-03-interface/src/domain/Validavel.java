package domain;

public interface Validavel {
    
    public boolean valida();

    default boolean validaDefault(String nome){
        boolean validouNome = true;

        return validouNome;
    }
}
