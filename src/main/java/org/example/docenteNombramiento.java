package org.example;

public class docenteNombramiento extends docente{
    private String tipoNombramiento;

    public docenteNombramiento(String nombre, String cedula, String fechaNacimiento, String tipoSangre, int codigo,String direccion, String tipoNombramiento) {
        super(nombre, cedula, fechaNacimiento, tipoSangre, codigo, direccion);
        this.tipoNombramiento = tipoNombramiento;
    }
    private String getTipoNombramiento() {
        return tipoNombramiento;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos de Nombramiento: \n");
        System.out.println("\tTipo de Nombramiento: " + getTipoNombramiento());
    }
}
