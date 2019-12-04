package br.com.moura.exception;

/**
 * @author alexandre.lovatini (alexandre.lovatini@castgroup.com.br)
 * @version 1.0
 * @since 1.0-SNAPSHOT
 */
public class RequiredFieldException extends Exception {

    private static final long serialVersionUID = -4405279873054377336L;

    /**
     * Construtor
     *
     * @since 1.0-SNAPSHOT
     */
    public RequiredFieldException() {super();}

    /**
     * Construtor
     *
     * @param cause
     *
     * @since 1.0-SNAPSHOT
     */
    public RequiredFieldException(Throwable cause) {super(cause);}

    /**
     * Construtor
     *
     * @param mensagem
     *
     * @since 1.0-SNAPSHOT
     */
    public RequiredFieldException(String mensagem) {super(mensagem);}

    /**
     * Construtor
     *
     * @param mensagem
     * @param cause
     *
     * @since 1.0-SNAPSHOT
     */
    public RequiredFieldException(String mensagem, Throwable cause) {
        super(mensagem, cause);
    }
}
