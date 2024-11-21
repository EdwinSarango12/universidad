package org.example;

import java.util.Scanner;

public class persona {
    private String nombre;
    private String cedula;
    private String fechaNacimiento;
    private String tipoSangre;
    private String direccion;

    public persona(String nombre, String cedula, String fechaNacimiento, String tipoSangre, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.direccion = direccion;
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
    private String getDireccion() {
        return direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*Setters*/

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /*Metodos*/
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

        System.out.println("Direccion: "+ direccion);
    }

    public void cambiarDatos(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion){
        /*Primera forma de declarar datos*/
        this.cedula=cedula;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.tipoSangre=tipoSangre;
        this.direccion=direccion;
    }
    public void cambiarDatos2(){
        setCedula(cedula);
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setTipoSangre(tipoSangre);
        setDireccion(direccion);
    }

    public void cambiarDatos3(){
        Scanner sc = new Scanner(System.in);
        cedula = sc.nextLine();
        nombre = sc.nextLine();
        fechaNacimiento = sc.nextLine();
        tipoSangre = sc.nextLine();
        direccion = sc.nextLine();
        setCedula(cedula);
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setTipoSangre(tipoSangre);
        setDireccion(direccion);

    }
    /*Recomendable usar esto*/
    public void cambiarDatos4(){
        Scanner sc = new Scanner(System.in);
        this.cedula = sc.nextLine();
        this.nombre = sc.nextLine();
        this.fechaNacimiento = sc.nextLine();
        this.tipoSangre = sc.nextLine();
        this.direccion = sc.nextLine();
    }
    
}
