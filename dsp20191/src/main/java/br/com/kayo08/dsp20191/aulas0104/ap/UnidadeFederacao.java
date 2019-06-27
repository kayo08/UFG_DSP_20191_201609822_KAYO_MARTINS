leia arquivoCaminho dado nomeArquivo ManipulaArquivo obtenhaUnidadesFederativas
UnidadeFederativa
package br.com.kayo08.aulas0104.ap; 


public class UnidadeFederacao {
    private String id, sigla, regiao;
    
    /*public UnidadeFederacao(String iden, String sigla, String desc, String codRegiao) {
        this.identificador = iden;
        this.sigla = sigla;
        this.descricao = desc;
        this.codigoRegiao = codRegiao;
    }*/
    
    public String getId() {
        return this.id;
    }
    
    public String getSigla() {
        return this.sigla;
    }
    
    public String getRegiao() {
        return this.regiao;
    }
}