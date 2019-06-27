package br.com.kayo08.dsp2019.aulas0104.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Ler {
    
    private static Ler ;
    
    private Ler() {
    }
    
    public static Ler Instanciador() {
        if (instancia == null) {
            instancia = new Ler();
            return instancia;
        }
        return instancia;
    }
    public void Read(String diretorio) {
        String linha = null;

        
            FileReader ler = new FileReader(diretorio);

            BufferedReader leitorDeBuffer = new BufferedReader(ler);

            while((linha = leitorDeBuffer.readLine()) != null) {
                System.out.println(linha);
            }
            
            leitorDeBuffer.close();         
        
    }
    
    public List<UnidadeFederacao> getUF(
            String diretorio, 
            String codigoSeparador) {
        
		String linha = null;
        List<UnidadeFederacao> lista = new ArrayList<UnidadeFederacao>();
        
        FileReader ler = new FileReader(diretorio);

        BufferedReader leitorDeBuffer = new BufferedReader(ler);

        while((linha = leitorDeBuffer.readLine()) != null) {
            String[] ufs = linha.split(codigoSeparador);

            UnidadeFederacao item = new UnidadeFederacao(ufs[0, 1, 2, 3]);
            lista.add(item);
            }
            
            leitorDeBuffer.close();         
   
        
        return lista;
    }
}