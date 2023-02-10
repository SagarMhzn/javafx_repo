/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package JFXPakage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author mahar
 */
public class Login_form extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        //creating label
        
        Label l1 = new Label("Username");
        Label l2 = new Label("Password");
        Label l3 = new Label("Gender");
        Label l4 = new Label("Course");
        Label l5 = new Label("Country");
        
        TextField t1 = new TextField();
        
        PasswordField p1 = new PasswordField();
        RadioButton r1 = new RadioButton("male");
        RadioButton r2 = new RadioButton("female");
        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        CheckBox c1 = new CheckBox("C");
        CheckBox c2 = new CheckBox("java");
        
        //dropdown
        
        ChoiceBox cb = new ChoiceBox();
        cb.getItems().addAll("Nepal","china","Japan");
        Button b1 = new Button("submit");
        
        //gridpane
        
        GridPane gp = new GridPane();
        gp.add(l1,0,0);
        gp.add(t1,1,0);
        gp.add(l1,0,1);
        gp.add(p1,1,1);
        gp.add(l3,0,2);
        gp.add(r1,1,2);
        gp.add(r2,2,2);
        gp.add(l4,0,3);
        gp.add(c1,1,3);
        gp.add(c2,2,3);
        gp.add(l5,0,4);
        gp.add(cb,1,4);
        gp.add(b1,0,5);
        
//        GridPane root = new GridPane();
//        root.getChildren().add(btn);
        
        Scene scene = new Scene(gp, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
