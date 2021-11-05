/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Alumno
 */
public class CrearArchivo {

    public static void main(String ars[]) {
        try {
            String ruta = "/ruta/filename.txt";
            String contenido = "Contenido de ejemplo";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo() {
       try {
            PrintWriter writer = new PrintWriter("/ruta/filename.txt", "UTF-8");
            writer.println("Primera línea");
            writer.println("Segunda línea");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
