public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica de autenticación OAuth
        System.out.println("Autenticando mediante OAuth");
        return true; // Ejemplo simplificado
    }
}
