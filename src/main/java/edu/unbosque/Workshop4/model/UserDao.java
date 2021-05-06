
package edu.unbosque.Workshop4.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;



public class UserDao {

    private ArrayList<user> users;
        private ArrayList<DataImages> dataImages;
        private WriteData data;
        private user user;


    public void agregarNombre(String nombre) {
        users.add(new user(nombre));

    }

    public void addInformatioImage(Date date, String description, String image) {
        dataImages.add(new DataImages(date , description, image));
        data.writeData(dataImages);
    }


        public String existUser(String nombre) {
            boolean x = false;
            String q = "";
            String w = "";

            for (user user1 : users) {
                if (user1.getUser().equals(nombre)) {
                    x = true;
                }
                if (x == true) {
                    q = "no pasa";
                } else {
                    q = "Pasa";
                }
            }
            return q;
        }
    public static String generateString(String name) {
        name = UUID.randomUUID().toString();
        return  name;
    }
    public String watchData(String description ) {
        String img = new String();
        for (DataImages dat : dataImages) {
            if (dat.getDescription().equals(description)) {
                img = dat.getImage();
            }
        }

        return img;
    }
}


