package JavaFx1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
    
public class LoginForm extends Application {

        @Override 
           public void start(Stage stage) {
            
            stage.setTitle("Login Form");            // Label the stage (a window)
            
            Pane theRoot = new Pane();
            
            Label lblHead = new Label("Login Form");
            
            Label lblFirst = new Label("Username");
            TextField text_1 = new TextField(); 
            Label lblSecond = new Label("Password");
            PasswordField text_2 = new PasswordField(); 
            
            DatePicker datePicker = new DatePicker();
            Button btnSubmit = new Button("Submit");

            
            lblHead.setLayoutX(300); lblHead.setLayoutY(50);
            lblHead.setFont(Font.font("Arial",24));
            
            lblFirst.setLayoutX(150); lblFirst.setLayoutY(100);
            text_1.setLayoutX(310); text_1.setLayoutY(100);
            lblSecond.setLayoutX(150); lblSecond.setLayoutY(150);
            text_2.setLayoutX(310); text_2.setLayoutY(150);
            
            btnSubmit.setLayoutX(250); btnSubmit.setLayoutY(250);
            
            datePicker.setLayoutX(250); datePicker.setLayoutY(300);
            
            btnSubmit.setOnAction((event) -> {  });

            theRoot.getChildren().addAll(lblHead, lblFirst,lblSecond,
                    text_1,text_2, btnSubmit, datePicker);
            
        
            Scene scene = new Scene(theRoot,650,500); //Creating a scene object
             
            stage.setScene(scene);    //Adding scene to the stage 
              
             stage.show();            //Displaying the contents of the stage
        }
        
        
        
                
         public static void main(String args[]){ 
             launch(args);
           } 
    }
