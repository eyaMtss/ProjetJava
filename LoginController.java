/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import static sun.java2d.cmm.ColorTransform.In;

/**
 * FXML Controller class
 *
 * @author eyama
 */
public class LoginController implements Initializable {
    @FXML
    private Button SinIn ;
   /* @FXML
    private TextField TxtLogin;*/
    @FXML
    private TextField TxtLogin ;
    @FXML
    void display(ActionEvent event)
    {
        TxtLogin.setText("eya");
    }
    private PasswordField btnPass;
    @FXML
    void afficher()
    {
        btnPass.setText("eya");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    
}
