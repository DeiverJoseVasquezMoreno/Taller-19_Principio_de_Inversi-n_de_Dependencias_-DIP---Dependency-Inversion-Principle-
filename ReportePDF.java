public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte en PDF: " + contenido);
    }
}
