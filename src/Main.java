import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*File file = new File("C:\\Users\\GreenSQA\\Documents\\CapituloFundamentosProgramacion\\Data\\Prueba.txt");

        System.out.println(file.exists());

        System.out.println(file.delete());

        File file1 = new File("C:\\Users\\GreenSQA\\Documents\\CapituloFundamentosProgramacion\\Data\\pruebagaby.txt");

        try{
            file1.createNewFile();
        }catch (IOException e){
            System.out.println("No se puede crear el archivo"+e.getMessage());
        }*/

        File file = new File("C:\\Users\\GreenSQA\\Documents\\CapituloFundamentosProgramacion\\Data\\test.txt");

        System.out.println(file.exists());

        String ruta = "C:/Users/GreenSQA/Documents/CapituloFundamentosProgramacion/Data/test.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            calculoPromedio(br);
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: " + e.getMessage());
        }

    }


        public static void calculoPromedio(BufferedReader br){
            //BufferedReader br = new BufferedReader(FileReader fr);

            int suma = 0;
            int contador = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            try {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split("\\s+");
                    for (String parte : partes) {
                        try {
                            int numero = Integer.parseInt(parte);
                            suma += numero;
                            contador++;
                            if (numero > max) {
                                max = numero;
                            }
                            if (numero < min) {
                                min = numero;
                            }
                        } catch (NumberFormatException e) {
                            // Ignorar los que no son números
                        }
                    }
                }
                if (contador > 0) {
                    double promedio = (double) suma / contador;
                    System.out.println("Promedio: " + promedio);
                    System.out.println("Número mayor: " + max);
                    System.out.println("Número menor: " + min);
                } else {
                    System.out.println("No se encontraron números válidos en el archivo.");
                }

            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }

   }
}