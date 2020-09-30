/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard_design;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hocin
 */
public class Home_barController implements Initializable {

    @FXML
    private JFXButton homeBtn;
    @FXML
    private JFXButton SudentsBtn;
    @FXML
    private JFXButton NotsBtn;
    @FXML
    private JFXButton LogOutBtn;
    JFXHamburger hamburger;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
          
    }

     @FXML
    private void LogOut(ActionEvent event) throws IOException {

        Stage window = (Stage) LogOutBtn.getScene().getWindow();
        Dashboard_design dash = new Dashboard_design();
        dash.start(new Stage());
        window.close();

    }
   

}
