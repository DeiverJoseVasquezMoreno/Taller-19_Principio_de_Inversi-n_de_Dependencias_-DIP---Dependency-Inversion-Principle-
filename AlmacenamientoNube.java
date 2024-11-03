public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardar(String archivo) {
        System.out.println("Guardando archivo en la nube: " + archivo);
    }

    @Override
    public String recuperar(String nombreArchivo) {
        return "Recuperando archivo de la nube: " + nombreArchivo;
    }
}
