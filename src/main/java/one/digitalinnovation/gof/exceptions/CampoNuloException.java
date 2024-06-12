package one.digitalinnovation.gof.exceptions;

public class CampoNuloException extends BusinessException{
    public CampoNuloException(String mensagem) {
        super(mensagem);
    }
    public CampoNuloException(String mensagem, Object ... params) {
        super(String.format(mensagem, params));
    }
}
