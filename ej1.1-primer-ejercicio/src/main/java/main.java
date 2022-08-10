import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main (String[] args) throws IOException {

        //Ruta del archivo
        Path filePath = Paths.get("C:\\Users\\ana.carton\\IdeaProjects\\Itinerario_Backend\\ej1.1-primer-ejercicio\\fichero.txt");
        List<Persona> listaPersonas = new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)){
            String currentLine;
            while((currentLine = br.readLine()) != null){//while there is content on the current line

                String[] info = currentLine.split(":");

                Persona persona;

                switch (info.length) {
                    case 1:
                        persona = new Persona (info[0], "", "");
                        break;
                    case 2:
                        persona = new Persona (info[0], info[1], "");

                        break;

                    default:
                        persona = new Persona (info[0], info[1], info[2]);
                        break;
                }

                    listaPersonas.add(persona);

            }
        }catch(IOException ex){
            ex.printStackTrace(); //handle an exception here
        }

        listaPersonas.stream()
                .filter(x-> !x.getEdad().equals("") && Integer.parseInt(x.getEdad())<25)
                .forEach(System.out::println);


    }
}
