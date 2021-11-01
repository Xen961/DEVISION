/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xen;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author salah
 */
public class MainController implements Initializable {

  //  private Button btn1;
    @FXML
    private Button btnLogin;
    @FXML
    private TextField userInput;
    @FXML
    private PasswordField passwordInput;
    @FXML
    private Label labelMsg;
    @FXML
    private Button btnCancel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void handleButtonAction(ActionEvent event) {
//        if(event.getSource()==btnLogin){
//          String user= userInput.getText();
//          labelMsg.setText("Welcome "+user);
//        }
        
           if(event.getSource()==btnCancel){
Stage stage = (Stage) btnCancel.getScene().getWindow();
stage.close();
        }
    }
    
    public void LoginButtonOnAction(ActionEvent event){
        if(userInput.getText().isEmpty() == false && passwordInput.getText().isEmpty()==false ){
            
        }else{
            labelMsg.setText("Please Enter Username and Password");
        }
    }
    
    
}
