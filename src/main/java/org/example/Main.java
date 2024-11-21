package org.example;
public class Main {
    public static void main(String[] args) {
        persona persona1 = new persona("Edwin Sarango","1751503234","06/02/2004","O+");
        System.out.println(persona1);
        /*persona1.Imprimir();*/

        estudiante estudiante1= new estudiante("Edwin Sarango","1751503234","06/02/2004","O+",20221445);
        /*estudiante1.Imprimir();*/

        estudianteBecado becado1= new  estudianteBecado("Edwin Sarango","1751503234","06/02/2004","O+",20221445,"Media Beca");
//        becado1.Imprimir();

        estudianteDeportista deportista1= new estudianteDeportista("Edwin Sarango","1751503234","06/02/2004","O+",20221445,"Tenis");
//        deportista1.Imprimir();

        /*Apartado Docente*/
        docente docente1= new docente("Juan Pablo Zaldumbide","2012982374","08/06/1992","O+",20202020);
//        docente1.Imprimir();




    }
}