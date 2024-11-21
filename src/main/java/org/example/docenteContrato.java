package org.example;

public class docenteContrato extends docente{
    private String TipoContrato;

    public docenteContrato(String nombre, String cedula, String fechaNacimiento, String tipoSangre, int codigo, String TipoContrato) {
        super(nombre, cedula, fechaNacimiento, tipoSangre, codigo);
        this.TipoContrato = TipoContrato;
    }
    private String getTipoContrato() {
        return TipoContrato;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos de Contrato: \n");
        System.out.println("Tipo de Contrato: " + TipoContrato);
    }

}
