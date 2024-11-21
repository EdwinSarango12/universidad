package org.example;

public class estudianteBecado extends estudiante{
    private String tipoBeca;

    public estudianteBecado(String nombre, String cedula, String fechaNacimiento, String tipoSangre, int codigo, String tipoBeca) {
        super(nombre, cedula, fechaNacimiento, tipoSangre, codigo);
        this.tipoBeca = tipoBeca;
    }
    private String getTipoBeca() {
        return tipoBeca;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos Estudiante Becado: \n");
        System.out.println("Tipo de beca: " + tipoBeca);
    }
}
