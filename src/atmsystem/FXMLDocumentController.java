/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;

/**
 * FXML Controller class
 *
 * @author crowl
 */
public class FXMLDocumentController implements Initializable {
    
    String pin ="";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private Label label;

    @FXML
    private JFXButton button1;

    @FXML
    private JFXButton button2;

    @FXML
    private JFXButton button4;

    @FXML
    private JFXButton button5;

    @FXML
    private JFXButton button3;

    @FXML
    private JFXButton button6;

    @FXML
    private JFXButton button7;

    @FXML
    private JFXButton button8;

    @FXML
    private JFXButton button9;

    @FXML
    private JFXButton buttonc;

    @FXML
    private JFXButton button0;

    @FXML
    private JFXButton buttonok;

    @FXML
    private JFXPasswordField editpin;

    void editpin(ActionEvent event) {

    }

    void tekan0(ActionEvent event) {

    }

    void tekan1(ActionEvent event) {
        pin += "1";
        editpin.setText(pin);
    }

    void tekan2(ActionEvent event) {
        pin += "2";
        editpin.setText(pin);
    }

    void tekan3(ActionEvent event) {
        pin += "3";
        editpin.setText(pin);
    }

    void tekan4(ActionEvent event) {
        pin += "4";
        editpin.setText(pin);
    }

    void tekan5(ActionEvent event) {
        pin += "5";
        editpin.setText(pin);
    }

    void tekan6(ActionEvent event) {
        pin += "6";
        editpin.setText(pin);
    }

    void tekan7(ActionEvent event) {
        pin += "7";
        editpin.setText(pin);
    }

    void tekan8(ActionEvent event) {
        pin += "8";
        editpin.setText(pin);
    }

    void tekan9(ActionEvent event) {
        pin += "9";
        editpin.setText(pin);
    }

    void tekanc(ActionEvent event) {
        pin += "";
        editpin.setText(pin);
    }

    @FXML
    void tekanok(ActionEvent event) {
        if (pin.equals(PIN)){
            try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 494, 545);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            }
            catch (IOException e){
                System.out.println("gagal membuat halaman baru" + e);
            }
        }
        else {
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Tidak Benar \nTersisa " + kesempatan + "kesempatan lagi!");
            editpin.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}
