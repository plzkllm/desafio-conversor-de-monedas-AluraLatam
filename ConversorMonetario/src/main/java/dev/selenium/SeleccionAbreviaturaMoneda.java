package dev.selenium;

public class SeleccionAbreviaturaMoneda {
    public static String[] identificarAbreviaturaMoneda(int opc){
        String[] abreviaturas = new String[2];
        switch (opc){
            case 1: abreviaturas[0]="USD"; abreviaturas[1]="ARS"; break;
            case 2: abreviaturas[0]="ARS"; abreviaturas[1]="USD"; break;
            case 3: abreviaturas[0]="USD"; abreviaturas[1]="BRL"; break;
            case 4: abreviaturas[0]="BRL"; abreviaturas[1]="USD"; break;
            case 5: abreviaturas[0]="USD"; abreviaturas[1]="COP"; break;
            case 6: abreviaturas[0]="COP"; abreviaturas[1]="ARS"; break;
            default: abreviaturas[0]=""; abreviaturas[1]=""; break;
        }
        return abreviaturas;
    }
}
