package br.com.kayo08.dsp20191.aulas0104.ap;

import java.io.*;

public class main {
    public static void main(String[] args) {
        try {

            String content = "Desenvolvimento de Software para percistencia";

            // Cria arquivo
            File file = new File("src/br.com.kayo08.dsp20191.aulas0104.ap.main/resources/teste.txt");

            // Escrever
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            // Ler arquivo
            FileReader ler = new FileReader("src/br.com.kayo08.dsp20191.aulas0104.ap.main/resources/teste.txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
