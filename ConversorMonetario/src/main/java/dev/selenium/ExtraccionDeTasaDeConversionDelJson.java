package dev.selenium;

import com.google.gson.Gson;

import java.util.Map;

public class ExtraccionDeTasaDeConversionDelJson {

    public static String extraccion(String json, String abreviatura){
        Gson gson = new Gson();
        TasasDeConversionOmdb tasas = gson.fromJson(json, TasasDeConversionOmdb.class);
        return tasas.conversion_rates().get(abreviatura);
    }
}
