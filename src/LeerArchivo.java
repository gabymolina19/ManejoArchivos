import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LeerArchivo {

    public static void main(String[] args) {

       // String ruta = "E:\\\\Proyectos_BanBta\\\\I-Test-AI\\\\ManejoArchivos\\\\Data\\\\"; // Asegúrate de que la ruta termina con '/'

        String ruta = "C:/Users/GreenSQA/Documents/CapituloFundamentosProgramacion/Data/";
        try (
                FileWriter fw = new FileWriter(ruta + "pruebagaby.txt");
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            bw.write("Holamundo");
            bw.newLine();
            bw.write("Holamundo2");
            bw.newLine();
            bw.write("Jorge ");
            bw.newLine();
            bw.write("Celedon");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
