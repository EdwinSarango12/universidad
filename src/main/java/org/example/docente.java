package org.example;

public class docente extends persona {
    private int codigo;

    public docente(String nombre, String cedula, String fechaNacimiento, String tipoSangre, int codigo) {
        super(nombre, cedula, fechaNacimiento, tipoSangre);
        this.codigo = codigo;
    }
    private int getCodigo() {
        return codigo;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos del Docente: \n");
        System.out.println("Codigo Docente: " + codigo);
    }
}
