public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String archivo) {
        almacenamiento.guardar(archivo);
    }

    public String recuperarArchivo(String nombreArchivo) {
        return almacenamiento.recuperar(nombreArchivo);
    }
}
