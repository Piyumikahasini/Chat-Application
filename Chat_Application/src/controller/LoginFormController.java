package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    public TextField enterName;
    static String userName;

    public void Txt_name_on_action(ActionEvent actionEvent) throws IOException {

        userName = enterName.getText();
        enterName.clear();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(LoginFormController.class.getResource("../view/client.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.getIcons().add(new Image("assest/chat Logo.png"));
        stage.show();
    }

    public void loginBtnOnAction(MouseEvent mouseEvent) throws IOException {
        userName = enterName.getText();
        enterName.clear();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(LoginFormController.class.getResource("../view/client.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.getIcons().add(new Image("assest/chat Logo.png"));
        stage.show();
    }
}
