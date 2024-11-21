package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cedula;
        String nombre;
        String fechaNacimiento;
        String tipoSangre;
        String direccion;

        persona persona1 = new persona("","","","","");
        persona1.cambiarDatos("1751503234","Edwin","02/06/2004","O+","Norte");
        /*persona1.Imprimir();*/
        /*persona1.cambiarDatos3();*/
        persona1.cambiarDatos4();
        persona1.Imprimir();






        /*estudiante estudiante1= new estudiante("Edwin Sarango","1751503234","06/02/2004","O+",20221445);
        *//*estudiante1.Imprimir();*//*

        estudianteBecado becado1= new  estudianteBecado("Edwin Sarango","1751503234","06/02/2004","O+",20221445,"La armenia","Media Beca");
//        becado1.Imprimir();

        estudianteDeportista deportista1= new estudianteDeportista("Edwin Sarango","1751503234","06/02/2004","O+",20221445,"Tenis");
//        deportista1.Imprimir();

        *//*Apartado Docente*//*
        docente docente1= new docente("Juan Pablo Zaldumbide","2012982374","08/06/1992","O+",20202020,"La armenia");
//        docente1.Imprimir();
        docenteContrato contrato1= new docenteContrato("Juan Pablo Zaldumbide","2012982374","08/06/1992","O+",20202020,"la armenia","Ingeniero Dcoente");
//        contrato1.Imprimir();

        docenteNombramiento nombramiento1 = new docenteNombramiento("Juan Pablo Zaldumbide","2012982374","08/06/1992","O+",20202020,"la armenia","Ingeniero Software");
        nombramiento1.Imprimir();*/

    }
}