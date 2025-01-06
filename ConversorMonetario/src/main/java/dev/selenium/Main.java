package dev.selenium;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int opc;
        double cantidad_monetaria;
        do{
            Menu.menu();
            opc = entrada.nextInt();
            if(opc==7){
                System.out.println("Gracias por usar el sistema, adios ;D");
            } else if (opc>=1 && opc <=6) {
                //Dolar(USD) peso argentino(ARS) real brasileño(BRL) peso colombiano(COP)
                String[] abreviaturas = SeleccionAbreviaturaMoneda.identificarAbreviaturaMoneda(opc);
                String json=SolicitudTasaCambio.obtenerTasaDeCambio(abreviaturas[0]);
                double tasa_de_conversion= Double.valueOf(ExtraccionDeTasaDeConversionDelJson.extraccion(json,abreviaturas[1]));
                System.out.println("Ingrese el valor que deseas convertir");
                cantidad_monetaria=entrada.nextDouble();

            } else {
                System.out.println("Ingrese una opción valida");
            }
        } while(opc!=7);

        //primera prueba de obtencion de datos de la API


    }
}