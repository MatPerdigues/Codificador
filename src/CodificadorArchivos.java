import java.io.IOException;


public class CodificadorArchivos {

    public static void main (String[] args) throws IOException {

        String a = "codificar";
        String b = "decodificar";

        if(args[3].equals(a)) {

            int desplazamiento = Integer.parseInt(args[2]);

            String txtCodificado = LectorArchivo.lector(args[0], desplazamiento);

            CreadorArchivo.creador(args[1], txtCodificado);

        }

        if(args[3].equals(b)) {

            int desplazamiento = Integer.parseInt(args[2]);

            String txtDecodificado = DecodificadorArchivo.decodificador(args[1], desplazamiento);

            CreadorArchivo.creador(args[4], txtDecodificado);

        
        }

    }
}
