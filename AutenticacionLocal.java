public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica de autenticación local
        return "admin".equals(usuario) && "1234".equals(contrasena);
    }
}
