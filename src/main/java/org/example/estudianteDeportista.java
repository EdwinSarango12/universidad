package org.example;

public class estudianteDeportista extends estudiante{
    private String deporte;

    public estudianteDeportista(String nombre, String cedula, String fechaNacimiento, String tipoSangre, int codigo, String deporte) {
        super(nombre, cedula, fechaNacimiento, tipoSangre, codigo);
        this.deporte = deporte;
    }
    private String getDeporte() {
        return deporte;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos Estudiante Deportista: \n");
        System.out.println("Deporte: "+ deporte);
    }
}
