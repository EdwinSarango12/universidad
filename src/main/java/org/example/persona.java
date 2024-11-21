package org.example;

public class persona {
    private String nombre;
    private String cedula;
    private String fechaNacimiento;
    private String tipoSangre;

    public persona(String nombre, String cedula, String fechaNacimiento, String tipoSangre) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
    }

    private String getNombre() {
        return nombre;
    }

    private String getCedula() {
        return cedula;
    }

    private String getFechaNacimiento() {
        return fechaNacimiento;
    }

    private String getTipoSangre() {
        return tipoSangre;
    }


    public void Imprimir(){
        System.out.println("\t Datos de la persona: \n");
        System.out.println("Cedula: "+ cedula);
        /*System.out.println("Cedula: "+this.getCedula());*/

        System.out.println("Nombre: "+ nombre);
        /*System.out.println("Nombre: "+ this.getNombre());*/

        System.out.println("FechaNacimiento: "+ fechaNacimiento);
        /*System.out.println("FechaNacimiento: "+ this.getFechaNacimiento());*/

        System.out.println("Tipo de Sangre: "+ tipoSangre);
        /*System.out.println("Tipo de Sangre: "+ this.getTipoSangre());*/

    }
}
