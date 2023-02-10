package JFXPakage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

//while writing in notes

//import javafx.application.*;
//import javafx.scene.*;
//import javafx.scene.layout.*;
//import javafx.scene.control.*;
//import javafx.scene.stage.*;
//import javafx.scene.event.*;


public class JFX_first extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        //creating 3 buttons
        Button b1 = new Button("But1");
        Button b2 = new Button("But2");
        Button b3 = new Button("But3");
        Button b4 = new Button("But4");
        Button b5 = new Button("But5");

        //StackPane is the defaultlayout ; flowpane, borderpan,gridpane
        
//        StackPane root = new StackPane();
//          Scene scene = new Scene(root, 300, 250);
//        root.getChildren().add(btn);//adding button to layout
        //flowpane example
        
//        FlowPane fp = new FlowPane();
//        fp.setHgap(10);
//        fp.setVgap(10);
//        fp.getChildren().add(b1);
//        fp.getChildren().add(b2);
//        fp.getChildren().add(b3);
//
//        Scene scene = new Scene(fp, 300, 250);
//        
        //scene is the window in fx
        
        //BorderPane example
        
//        BorderPane bp = new BorderPane();
//        bp.setCenter(b1);
//        bp.setLeft(b2);
//        bp.setRight(b3);
//        bp.setTop(b4);
//        bp.setBottom(b5);
//        
//        Scene scene = new Scene(bp,300, 250);
//        

        //GridPane example
        
        GridPane gp =  new GridPane();
        gp.add(b1,0,0);
        gp.add(b2, 0, 1);
        gp.add(b3,1,0);
        gp.add(b4,1,1);
        gp.add(b5, 1, 2);
        
        Scene scene = new Scene(gp,300,250);
        
        
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
