import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LectorArchivo {

    public static void main (String[] args) throws IOException {

    }

    public static String lector (String rutaOrigen, int desplazamiento) throws IOException {


        String abc = "abcdefghijklmnñopqrstuvwxyz";

        char abcArray[] = abc.toCharArray();

        String archivo = rutaOrigen;

        Path p = Paths.get(archivo);

        if (Files.exists(p) && Files.isReadable(p)) {

            Scanner miEscaner = new Scanner(p);

            String code = "";

            while (miEscaner.hasNextLine()) {
                String linea = miEscaner.nextLine();
                char lineaArray[] = linea.toCharArray();


                for (int x = 0; x < lineaArray.length; x++) {
                    int index = abc.indexOf(lineaArray[x]);
                    code += abcArray[index + desplazamiento];
                }

            }

            return code;

        } else {
            return "Error: el archivo no existe";
        }
    }
}
