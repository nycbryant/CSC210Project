package com.example.ch12;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import static com.example.ch12.BurgerStoreDemo.*;

/**
 *  Kilometer Converter application
 */

public class BurgerStoreDemo extends Application
{
    // Fields
    private TextField userT;
    private TextField PwT;
    private Label Label1;
    private Label Label2;
    private Label Label3;

    public static void main(String[] args)
    {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        // Create a Label to display a prompt.
        Label promptLabel = new Label("Username:");
        Label promptLabel2 = new Label("Password:");

        // Create a TextField for input.
        userT = new TextField();
        PwT = new TextField();

        // Create a Button to perform the conversion.
        Button Button = new Button("Login");
        Button Button2 = new Button("dexter");
        Button Button3 = new Button("medium");

        // Register the event handler.
        Button.setOnAction(new LoginButtonHandler());

        // Create an empty Label to display the result.
        Label1 = new Label();
        Label2 = new Label();
        Label3 = new Label();

        GridPane gridPane = new GridPane();

        gridPane.add(promptLabel, 0, 0);
        gridPane.add(promptLabel2, 0,1);
        gridPane.add(userT, 1,0);
        gridPane.add(PwT, 1,1);
        gridPane.add(Button, 1, 2);
        //gridPane.add(Button2, 0,2);
        //gridPane.add(Button3, 0,3);
        gridPane.add(Label1, 1, 3);
        //gridPane.add(Label2, 1, 2);
        //gridPane.add(Label3, 1, 3);

        // Create a Scene.
        Scene scene = new Scene(gridPane);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("Burger Store");

        // Show the window.
        primaryStage.show();
    }

    /*
     * Event handler class for calcButton
     */

    class LoginButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            //String userN = BurgerStore.getUsername();

            Label1.setText("Login Succesful");


            // Display the results.

            //Label1.setText("Login Succesful");

            //resultLabel.setText((miles.toString()));
        }

    }

}