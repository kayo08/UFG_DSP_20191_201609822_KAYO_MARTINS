package br.com.kayo08.dsp20191.aulas0104.ap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoTexto {
    public static void main(String[] args) {
        
        String arquivo = new File("arquivo.txt");

        Ler.Instanciador().getUF(new File("src/main/resources/UF.csv").getAbsolutePath(),",").forEach((item) {
            System.out.println("ID     - " + item.getId());
            System.out.println("UF     - " + item.getSigla());
            System.out.println("Região - " + item.getRegiao());
        };
    }
    
    private static void escrevaArquivo(String mensagem) {
        File arquivo = new File("arquivo.txt");
        FileWriter fr = null;
        
        fr = new FileWriter(arquivo);
        fr.write(mensagem);
    }
}