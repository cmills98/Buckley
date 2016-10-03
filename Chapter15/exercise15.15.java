package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	
	
public void start(Stage primaryStage) {
	
		Pane root = new Pane();
		
		
		
		root.setOnMouseClicked(e -> {
			
			
			if(e.getButton() == MouseButton.PRIMARY)
			{
				root.getChildren().add(new Circle( e.getX(), e.getY(), 25, Color.ALICEBLUE )); 
				 
			}
			
			if(e.getButton() == MouseButton.SECONDARY)
			{
			root.getChildren().remove(e.getTarget());
			}
			
		});
		
		Scene scene = new Scene(root,300,300);
		
		primaryStage.setTitle("Fun Game");
		primaryStage.setScene(scene);
		primaryStage.show();
		root.requestFocus();
	
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
