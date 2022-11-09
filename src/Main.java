import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {

        String arquivo = "C:\\Users\\gabri\\Desktop\\teste.txt";
        Arquivo arq = new Arquivo(arquivo);
        String str = arq.getUmaString();

        System.out.println(str);

        //Huffman huffman = new Huffman("o rato roueu a roupa do rei de roma !! awdiaofboauwfv .,.");
        Huffman huffman = new Huffman(str);
        String encodedtext = huffman.encode();
        System.out.println(encodedtext);

        huffman.printCodes();

        String originalText = huffman.decode(encodedtext);
        System.out.println(originalText);
    }
}
