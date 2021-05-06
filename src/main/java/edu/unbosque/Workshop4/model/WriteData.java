package edu.unbosque.Workshop4.model;

import java.io.*;
import java.util.ArrayList;
import com.google.gson.Gson;

public class WriteData {
    public void  writeData(ArrayList<DataImages> dataImages) {

        try {

            FileWriter file = null;
            try {
                file = new FileWriter("\\Workshop4\\src\\main\\webapp\\data.json");
                String json = new Gson().toJson(dataImages);
                System.out.println("buenas");
                file.write((json));
                file.flush();
                file.close();

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            //manejar error
            System.out.println("hola");
        } finally {

        }
    }
     public ArrayList<DataImages> readData() {
        ObjectInputStream read;
        ArrayList<DataImages> reg = new ArrayList<DataImages>();
        try {
            read = new ObjectInputStream(new FileInputStream("data.json"));
            reg = (ArrayList<DataImages>) read.readObject();
            read.close();

        } catch (Exception e) {
            System.out.println("No hay nada");
        }
        return reg;
    }
}

   // private String data = data.json;
//      try {
//        ObjectOutputStream dat = null;
//        try {
//            BufferedWriter dat = new BufferedWriter(new FileWriter("data.json"));
//            dat.write(re);
//            dat.close();
//            System.out.println("dato ingresado en la base de datos.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//
//
//    public void readjson(){
//        String fichero = "";
//
//        try (BufferedReader br = new BufferedReader(new FileReader("datos.json"))) {
//            String linea;
//            while ((linea = br.readLine()) != null) {
//                fichero += linea;
//            }
//
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }



