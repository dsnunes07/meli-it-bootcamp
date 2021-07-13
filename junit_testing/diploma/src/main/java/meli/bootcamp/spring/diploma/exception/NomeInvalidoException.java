package meli.bootcamp.spring.diploma.exception;

public class NomeInvalidoException extends RuntimeException{

    public NomeInvalidoException(String mensagem) {
        super(mensagem);
    }
}
