package meli.bootcamp.spring.diploma.dto;

public class ExceptionDTO {
    private String campo;
    private String mensagem;

    public ExceptionDTO(String mensagem){
        super();
        this.mensagem = mensagem;
    }

    public ExceptionDTO(String campo, String mensagem) {
        this.campo = campo;
        this.mensagem = mensagem;
    }

    public String getCampo() {
        return campo;
    }

    public String getMensagem() {
        return mensagem;
    }
}
