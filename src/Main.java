import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream arquivo = new FileInputStream("C:\\Users\\gabri\\Desktop\\teste.txt");
        BufferedInputStream reader = new BufferedInputStream(arquivo);
        DataInputStream data = new DataInputStream(reader);

        byte vetByte[];

        vetByte = new byte[arquivo.available()];

        data.read(vetByte);

        int[] quantidades = new int[26];
        List<Caractere> caracteres = new ArrayList<Caractere>();

        for (char c : new String(vetByte).toUpperCase().toCharArray()) {
            int indice = c - 65;
            if (indice >= 0 && indice < 26) {
                quantidades[indice] += 1;
            }
        }

        for (int i = 0; i < quantidades.length; i++) {
            char letra = (char) (i + 65);
            caracteres.add(new Caractere(letra, quantidades[i]));
        }

        for(Caractere c : caracteres){
            System.out.println(c.getC()+" , "+c.getQtd());
        }

        Collections.sort(caracteres);
        System.out.println("Ordenando a lista:");

        for(Caractere c : caracteres){
            System.out.println(c.getC()+" , "+c.getQtd());
        }
    }
}
