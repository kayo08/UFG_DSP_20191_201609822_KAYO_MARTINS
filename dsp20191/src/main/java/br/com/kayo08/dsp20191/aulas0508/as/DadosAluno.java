package br.com.kayo08.dsp20191.aulas0508.as;

import java.io.*;

public class DadosAluno {

    public static void DadosAluno(String[] args) {
        Aluno aluno1 = new Aluno("Kayo", (long) 201609822, 8, 8);

        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("src/main/resources/avaliacao.dat");

            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF(aluno1.toString());

            read();
            fileOutputStream.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {

        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/main/resources/avaliacao.dat"));

            while (dataInputStream.available() > 0) {
                String linha = dataInputStream.readUTF();
                String aprovacao;
				double nota = (Aluno[3] + Aluno [4]) / 2;
                if (nota >= 5.0) {
                    aprovacao = "Aprovado  \n";
                } else {
                    aprovacao = "Reprovado \n";
                }
            }

    }
}