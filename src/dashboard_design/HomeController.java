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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hocin
 */
public class HomeController implements Initializable {

    @FXML
    private JFXDrawer mainBar;
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private JFXHamburger hamburger;
    @FXML
    private JFXButton homeBtn;
    @FXML
    private JFXButton SudentsBtn;
    @FXML
    private JFXButton NotsBtn;
    @FXML
    private JFXButton LogOutBtn;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
            try {
            VBox box = FXMLLoader.load(getClass().getResource("home_bar.fxml"));
            AnchorPane products = FXMLLoader.load(getClass().getResource("/Students/students.fxml"));

            mainBar.setSidePane(box);
            for (Node node : box.getChildren()) {
                if (node.getAccessibleText() != null) {
                    node.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
                        switch (node.getAccessibleText()) {
                            case "studentsMenu":
                                mainBar.close();
                                setNode(products);
                                break;

                        }
                    });

                }
            }
            HamburgerBackArrowBasicTransition burgerTask2 = new HamburgerBackArrowBasicTransition(hamburger);
            burgerTask2.setRate(-1);
            hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {

                burgerTask2.setRate(burgerTask2.getRate() * -1);
                burgerTask2.play();

                if (mainBar.isShown()) {
                    mainBar.close();
                } else {
                    mainBar.open();
                }

            });
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
            

            
        
            
            
        
    } 
    
    
    
    private void setNode(Node node) {
        AnchorPane.getChildren().clear();
        AnchorPane.getChildren().add((Node) node);
    }

    
}
