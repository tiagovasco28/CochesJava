/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import java.util.Iterator;
import recursos.Vehiculos;

/**
 *
 * @author Alumno
 */
public class Data {

    public static ArrayList<Vehiculos> lista;

    public Data() {
        lista = new ArrayList<>();
    }

    public void addCoche(Vehiculos v1) {
        lista.add(v1);
    }

    @Override
    public String toString() {

        Vehiculos vec;
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            vec = (Vehiculos) iter.next();
            System.out.println(vec.getNombre()+ " " + vec.getMarca() +" " + vec.getModelo() +" " + vec.getColor() +" "+ vec.getPrecio());

        }
        return null;
    }

}
