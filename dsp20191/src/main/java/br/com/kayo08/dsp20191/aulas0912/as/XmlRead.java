package br.com.kayo08.dsp20191.aulas0912.as;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class XmlRead {

    private static final Long Mat = 201609822l;

    public static void main(String[] args) {

        File inputFile = new File("src/main/resources/students.xml");
        SAXReader reader = new SAXReader();
        Document document = reader.read( inputFile );

        Element classElement = document.getRootElement();

        List<Node> nodes = document.selectNodes("/class/student" );

        for (Node node : nodes) {
            if (node.selectSingleNode("matricula").getText().equals(Mat.toString())) {
                System.out.println("Matrícula : " + node.selectSingleNode("matricula").getText());
                System.out.println("Name : "  + node.selectSingleNode("firstname").getText());
                System.out.println("Last Name : " + node.selectSingleNode("lastname").getText());
                System.out.println("Nickname : " + node.selectSingleNode("nickname").getText());
                System.out.println("Frequencia : ");
                System.out.println("\tAula: " + node.selectSingleNode("nickname").getText());
            }

        }
        
    }
}