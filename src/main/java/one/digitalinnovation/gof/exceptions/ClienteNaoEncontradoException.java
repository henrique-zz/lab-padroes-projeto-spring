package one.digitalinnovation.gof.exceptions;

public class ClienteNaoEncontradoException extends BusinessException{

    public ClienteNaoEncontradoException(String mensagem){
        super(mensagem);
    }
    public ClienteNaoEncontradoException(String mensagem, Object ... params) {
        super(String.format(mensagem, params));
    }
}
