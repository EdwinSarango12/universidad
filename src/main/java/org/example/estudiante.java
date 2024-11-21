package org.example;

public class estudiante extends persona{
    private int codigo;


    public estudiante(String nombre, String cedula, String fechaNacimiento, String tipoSangre,String direccion, int codigo) {
        super(nombre, cedula, fechaNacimiento, tipoSangre, direccion);
        this.codigo = codigo;
    }

    private int getCodigo() {
        return codigo;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos del estudiante: \n");
        System.out.println("codigo: " + codigo);

    }

}
