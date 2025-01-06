package dev.selenium;

import com.google.gson.Gson;

public class ExtraccionDeDatosJson {
    public static void extraccion(String json){
        Gson gson = new Gson();
        TasasDeConversionOmdb tasas = gson.fromJson(json, TasasDeConversionOmdb.class);
        System.out.println(tasas);
    }
}
