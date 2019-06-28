package br.com.kayo08.dsp20191.aulas0912.as;

public class InfoStudent {

    private Long matricula;
    private String firstname;
    private String lastname;
    private String nickname;
    private GetFrequencia frequencia;

    public InfoStudent (Long matricula, String firstname, String lastname, String nickname, GetFrequencia frequencia) {
        this.matricula = matricula;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.frequencia = frequencia;
    }
	//Matrícula
    public Long getMatricula() {
        return matricula;
    }
    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }
	//Primeiro Nome
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
	//Ultimo Nome
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
	//Nickname
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
	//Frequencia
    public GetFrequencia getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(GetFrequencia frequencia) {
        this.frequencia = frequencia;
    }
}