package loose.oose.fis.lab.student.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
* This is the main class of the reservation manager
* Currently this class contains some dummy users and some dummy reservations.
* Finally, after creating them, the main method of this class prints them out.
*
* Feel free to run the main method at any time. :)
*/

public class Main extends Application {
    /**
* @param args not used
*
* this method starts the application :)
*/

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        primaryStage.setTitle("FIS - Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

  //creating the users
    public static void main(String[] args) {
        launch(args);
    }
  //creating reservations
  //adding all the reservations to a list
  //printing out the reservations

}
