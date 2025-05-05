/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginpoli;
import controlador.LoginController;
import vista.LoginView;
import modelo.Model;
/**
 *
 * @author Harol
 */
public class LoginPOLI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // Crear modelo y vista
        Model modelo = new Model();
        LoginView vista = new LoginView();

        // Crear controlador
        LoginController controlador = new LoginController(modelo, vista);

        // Mostrar la vista
        vista.setVisible(true);
        
        vista.setLocationRelativeTo(null);
    }
    
}
