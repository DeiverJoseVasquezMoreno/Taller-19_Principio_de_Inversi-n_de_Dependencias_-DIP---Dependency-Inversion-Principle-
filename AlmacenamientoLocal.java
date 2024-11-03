public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardar(String archivo) {
        System.out.println("Guardando archivo localmente: " + archivo);
    }

    @Override
    public String recuperar(String nombreArchivo) {
        return "Recuperando archivo local: " + nombreArchivo;
    }
}
