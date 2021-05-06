package edu.unbosque.Workshop4.model;

import javax.ejb.Singleton;
import javax.xml.registry.infomodel.User;

public class UserSingleton {
    private String image;
    private String name;
    static private Singleton singleton;

    private UserSingleton(String image, String name) {
        this.image = image;
        this.name = name;
    }

    static public Singleton getSingleton(String image, String name) {

        if (singleton == null) {
            singleton = (Singleton) new UserSingleton(image, name);
        }
        return singleton;
    }

    public String metodo() {
        return "Singleton instanciado bajo demanda";
    }

}
