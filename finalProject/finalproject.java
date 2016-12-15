package application;

import java.util.Date;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application {

	static int i = 1;
	static int timeLineI = 10000;
	static long time = 0;
	static int c = 1;
	static boolean gameOver = true;

	public void start(Stage primaryStage) {
		// First Scene with Title and everything		
		BorderPane titleBpane = new BorderPane();
		Text gameTitle = new Text("CAR DESERTERS");
		gameTitle.setFont(Font.font("SansSerif", FontWeight.BLACK, FontPosture.REGULAR, 100));
		gameTitle.setStroke(Color.TAN);
		gameTitle.setFill(Color.TAN);

		Image image = new Image("desert.jpg");
		ImageView background = new ImageView(image);	
		background.setFitWidth(1000);
		background.setFitHeight(1000);
		//background.setX(500);
		//background.setY(500);
		//background.setVisible(true);
		//background.setBlendMode(BlendMode.OVERLAY);

		StackPane stPane = new StackPane();
		stPane.getChildren().addAll(gameTitle);
		stPane.setLayoutY(75);

		HBox btnBox = new HBox(10);
		Button btnSingleplayer = new Button("Singleplayer");
		Button btnMultiplayer = new Button("Multiplayer");
		btnBox.getChildren().addAll(btnSingleplayer, btnMultiplayer);
		btnBox.setAlignment(Pos.CENTER);


		StackPane stPane1 = new StackPane();
		stPane1.getChildren().addAll(background, btnBox);
		//stPane1.getChildren().addAll(background);

		titleBpane.setCenter(stPane1);
		titleBpane.setTop(stPane);



		Scene titleScene = new Scene(titleBpane,1000, 1000);
		primaryStage.setTitle("Start Game");
		primaryStage.setScene(titleScene);


		//This is where the second scene starts with the single player mode
		Button backBtnS = new Button("Back");
		backBtnS.resize(100, 10);

		BorderPane singleplayerroot = new BorderPane();
		HBox btnPane = new HBox(5);
		btnPane.resize(100, 10);
		btnPane.getChildren().add(backBtnS);


		Line line1 = new Line(0,1000, 350,400);
		line1.setStroke(Color.WHITE);
		line1.setStrokeWidth(25);
		Line line2 = new Line(1000,750, 650, 400);
		line2.setStroke(Color.WHITE);
		line2.setStrokeWidth(25);

		Rectangle ground = new Rectangle();
		ground.setStroke(Color.TAN);
		ground.setStrokeWidth(1000);
		ground.setY(500);
		ground.setWidth(1000);

		Rectangle skyLine = new Rectangle();
		skyLine.setStroke(Color.DEEPSKYBLUE);
		skyLine.setStrokeWidth(600);
		skyLine.setY(100);
		skyLine.setWidth(1000);



		Circle cloud11 = new Circle(30);
		cloud11.setFill(Color.WHITE);
		Circle cloud12 = new Circle(28);
		cloud12.setFill(Color.WHITE);
		Circle cloud13 = new Circle(30);
		cloud13.setFill(Color.WHITE);

		HBox clouds1 = new HBox(-10);
		clouds1.getChildren().addAll(cloud11, cloud12, cloud13);
		clouds1.setLayoutX(100);
		clouds1.setLayoutY(150);



		Circle cloud21 = new Circle(18);
		cloud21.setFill(Color.WHITE);
		Circle cloud22 = new Circle(20);
		cloud22.setFill(Color.WHITE);
		Circle cloud23 = new Circle(18);
		cloud23.setFill(Color.WHITE);

		HBox clouds2 = new HBox(-10);
		clouds2.getChildren().addAll(cloud21, cloud22, cloud23);
		clouds2.setLayoutX(400);
		clouds2.setLayoutY(250);



		Circle cloud31 = new Circle(20);
		cloud31.setFill(Color.WHITE);
		Circle cloud32 = new Circle(19);
		cloud32.setFill(Color.WHITE);
		Circle cloud33 = new Circle(20);
		cloud33.setFill(Color.WHITE);

		HBox clouds3 = new HBox(-10);
		clouds3.getChildren().addAll(cloud31, cloud32, cloud33);
		clouds3.setLayoutX(900);
		clouds3.setLayoutY(100);


		Circle cloud41 = new Circle(15);
		cloud41.setFill(Color.WHITE);
		Circle cloud42 = new Circle(17);
		cloud42.setFill(Color.WHITE);
		Circle cloud43 = new Circle(15);
		cloud43.setFill(Color.WHITE);		

		HBox clouds4 = new HBox(-10);
		clouds4.getChildren().addAll(cloud41, cloud42, cloud43);
		clouds4.setLayoutX(650);
		clouds4.setLayoutY(250);



		Circle cloud51 = new Circle(25);
		cloud51.setFill(Color.WHITE);
		Circle cloud52 = new Circle(25);
		cloud52.setFill(Color.WHITE);
		Circle cloud53 = new Circle(25);
		cloud53.setFill(Color.WHITE);		

		HBox clouds5 = new HBox(-10);
		clouds5.getChildren().addAll(cloud51, cloud52, cloud53);
		clouds5.setLayoutX(400);
		clouds5.setLayoutY(100);




		Polyline street = new Polyline(0, 1000, 350, 400, 650, 400, 1000, 750, 1000, 1000, 0, 1000);
		street.setStroke(Color.DARKGRAY);
		street.setFill(Color.DARKGRAY);

		//Circle cSpot = new Circle(500, 400, 5);
		//	LinearGradient skyGradient = new LinearGradient(500, 400, 500, 0, true, CycleMethod.NO_CYCLE, java.util.List<Stop> stops);

		Polyline mountainRange1 = new Polyline(0, 425,
				1000, 425, 1000, 375, 
				990, 355, 980, 375, 970, 365, 950, 377, 920, 375, 900, 387, 880, 355, 850, 370, 820, 360, 800, 375,  	
				780, 355, 750, 375, 725, 365, 680, 377, 650, 375, 625, 387, 600, 355, 570, 370, 550, 360, 500, 375,
				470, 365, 450, 377, 430, 375, 400, 387, 375, 375, 350, 387, 320, 355, 290, 370, 250, 360, 220, 375,
				190, 375, 175, 365, 150, 377, 120, 375, 100, 387, 95, 355, 85, 377, 70, 375, 60, 387, 43, 355,
				30, 375, 20, 365, 10, 377, 
				0, 375, 0, 425);
		mountainRange1.setStroke(Color.BROWN);
		mountainRange1.setFill(Color.BROWN);

		Polyline mountainRange2 = new Polyline(0, 425, 
				1000, 425, 1000, 350, 
				990, 325, 980, 345, 970, 335, 950, 347, 920, 325, 900, 327, 880, 345, 850, 330, 820, 310, 800, 335,  	
				780, 325, 750, 345, 725, 335, 680, 347, 650, 325, 625, 327, 600, 345, 570, 330, 550, 310, 500, 335,
				470, 325, 450, 337, 430, 325, 400, 347, 375, 335, 350, 347, 320, 315, 290, 330, 250, 320, 220, 335,
				190, 325, 175, 335, 150, 347, 120, 325, 100, 347, 95, 335, 85, 337, 70, 315, 60, 337, 43, 315,
				30, 335, 20, 325, 10, 337,  
				0, 350, 0, 425);
		mountainRange2.setStroke(Color.CADETBLUE);
		mountainRange2.setFill(Color.CADETBLUE);



		Line dPath1 = new Line(500, 400, 500 ,1100);
		dPath1.setStroke(Color.TRANSPARENT);
		dPath1.setFill(Color.TRANSPARENT);
		Rectangle dash1 = new Rectangle();
		dash1.setStroke(Color.WHITE);
		dash1.setFill(Color.WHITE);
		dash1.setWidth(20);
		dash1.setHeight(50);
		PathTransition dpt1 = new PathTransition(Duration.millis(timeLineI), dPath1, dash1);
		dpt1.setCycleCount(Timeline.INDEFINITE);
		dpt1.play();		

		Line dPath2 = new Line(500, 300, 500 , 1100);
		dPath2.setStroke(Color.TRANSPARENT);
		dPath2.setFill(Color.TRANSPARENT);
		Rectangle dash2 = new Rectangle();
		dash2.setY(550);
		dash2.setStroke(Color.WHITE);
		dash2.setFill(Color.WHITE);
		dash2.setWidth(20);
		dash2.setHeight(50);
		PathTransition dpt2 = new PathTransition(Duration.millis(timeLineI + 1000), dPath2, dash2);
		dpt2.setCycleCount(Timeline.INDEFINITE);
		dpt2.play();	


		Line dPath3 = new Line(500, 200, 500 , 1100);
		dPath3.setStroke(Color.TRANSPARENT);
		dPath3.setFill(Color.TRANSPARENT);
		Rectangle dash3 = new Rectangle();
		dash3.setY(700);
		dash3.setStroke(Color.WHITE);
		dash3.setFill(Color.WHITE);
		dash3.setWidth(20);
		dash3.setHeight(50);
		PathTransition dpt3 = new PathTransition(Duration.millis(timeLineI+2000), dPath3, dash3);
		dpt3.setCycleCount(Timeline.INDEFINITE);
		dpt3.play();	


		Line dPath4 = new Line(500, 100, 500 , 1100);
		dPath4.setStroke(Color.TRANSPARENT);
		dPath4.setFill(Color.TRANSPARENT);
		Rectangle dash4 = new Rectangle();
		dash4.setY(850);
		dash4.setStroke(Color.WHITE);
		dash4.setFill(Color.WHITE);
		dash4.setWidth(20);
		dash4.setHeight(50);
		PathTransition dpt4 = new PathTransition(Duration.millis(timeLineI+3000), dPath4, dash4);
		dpt4.setCycleCount(Timeline.INDEFINITE);
		dpt4.play();	

		Line dPath5 = new Line(500, 0, 500 , 1100);
		dPath5.setStroke(Color.TRANSPARENT);
		dPath5.setFill(Color.TRANSPARENT);
		Rectangle dash5 = new Rectangle();
		dash5.setY(900);
		dash5.setStroke(Color.WHITE);
		dash5.setFill(Color.WHITE);
		dash5.setWidth(20);
		dash5.setHeight(50);
		PathTransition dpt5 = new PathTransition(Duration.millis(timeLineI +4000), dPath5, dash5);
		dpt5.setCycleCount(Timeline.INDEFINITE);
		dpt5.play();	


		Line path1 = new Line( 500, 400, 50, 1100);
		path1.setFill(Color.TRANSPARENT);
		path1.setStroke(Color.TRANSPARENT);
		Circle object11 = new Circle(5);
		object11.setFill(Color.BLACK);

		PathTransition pt11 = new PathTransition(Duration.millis(timeLineI), path1, object11);
		pt11.setCycleCount(Timeline.INDEFINITE);
		pt11.play();



		Line path2 = new Line(490, 400,250, 1000);
		path2.setFill(Color.TRANSPARENT);
		path2.setStroke(Color.TRANSPARENT);
		Circle object12 = new Circle(5);
		object12.setFill(Color.BLACK);

		PathTransition pt12 = new PathTransition(Duration.millis(timeLineI), path2, object12);
		pt12.setCycleCount(Timeline.INDEFINITE);
		pt12.setDelay(Duration.millis(4000));


		pt12.play();




		Line path3 = new Line( 500, 400, 500 ,1000);
		path3.setFill(Color.TRANSPARENT);
		path3.setStroke(Color.TRANSPARENT);
		Circle object13 = new Circle(5);
		object13.setFill(Color.BLACK);

		PathTransition pt13 = new PathTransition(Duration.millis(timeLineI), path2, object12);
		pt13.setCycleCount(Timeline.INDEFINITE);
		pt13.setDelay(Duration.millis(3000));

		pt13.play();



		Line path4 = new Line(510 , 400,750, 1000);
		path4.setFill(Color.TRANSPARENT);
		path4.setStroke(Color.TRANSPARENT);
		Circle object14 = new Circle(5);
		object14.setFill(Color.BLACK);

		PathTransition pt14 = new PathTransition(Duration.millis(timeLineI), path4, object14);
		pt14.setCycleCount(Timeline.INDEFINITE);
		pt14.setDelay(Duration.millis(2000));

		pt14.play();


		Line path5 = new Line(520 , 400, 900, 1000);

		path5.setFill(Color.TRANSPARENT);
		path5.setStroke(Color.TRANSPARENT);
		Circle object15 = new Circle(5);
		object15.setFill(Color.BLACK);

		PathTransition pt15 = new PathTransition(Duration.millis(timeLineI), path5, object15);
		pt15.setCycleCount(Timeline.INDEFINITE);
		pt15.setDelay(Duration.millis(1000));
		pt15.play();



		Rectangle carBody = new Rectangle();
		carBody.setStroke(Color.BLACK);
		carBody.setStrokeWidth(2);
		carBody.setFill(Color.RED);
		carBody.setX(500);
		carBody.setY(900);		
		carBody.setWidth(100);
		carBody.setArcWidth(10);
		carBody.setHeight(50);
		carBody.setArcHeight(10);

		Rectangle wheel1 = new Rectangle();
		wheel1.setStroke(Color.BLACK);
		wheel1.setStrokeWidth(2);
		wheel1.setFill(Color.BLACK);
		wheel1.setX(510);
		wheel1.setY(910);		
		wheel1.setWidth(20);
		wheel1.setArcWidth(20);
		wheel1.setHeight(50);
		wheel1.setArcHeight(10);
		wheel1.xProperty().bind(carBody.xProperty());  


		Rectangle wheel2 = new Rectangle();
		wheel2.setStroke(Color.BLACK);
		wheel2.setStrokeWidth(2);
		wheel2.setFill(Color.BLACK);
		wheel2.setX(700);
		wheel2.setY(910);		
		wheel2.setWidth(20);
		wheel2.setArcWidth(20);
		wheel2.setHeight(50);
		wheel2.setArcHeight(10);
		wheel2.xProperty().bind(carBody.xProperty().add(80));   


		Text lost = new Text("You Lost");
		lost.setFont(Font.font("Rockwell", FontWeight.BOLD, FontPosture.ITALIC, 100));
		lost.setStroke(Color.BLACK);
		lost.setFill(Color.RED);
		lost.setStrokeWidth(2);
		StackPane lostPane = new StackPane();
		lostPane.getChildren().add(lost);


		Text pause = new Text("Pause");
		pause.setFont(Font.font("Rockwell", FontWeight.BOLD, FontPosture.ITALIC, 100));
		pause.setStroke(Color.BLACK);
		pause.setStrokeWidth(2);
		pause.setFill(Color.GHOSTWHITE);
		StackPane pausePane = new StackPane();
		pausePane.getChildren().add(pause);




		singleplayerroot.getChildren().addAll(ground, street,
				path1, object11, path2, object12, path3, object13, path4, object14, path5, object15,
				dPath1,dash1, dPath2, dash2, dPath3, dash3, dPath4, dash4, dPath5, dash5,
				line1, line2,skyLine, mountainRange2, mountainRange1, clouds1, clouds2, clouds3, clouds4, clouds5, 
				wheel1, wheel2,  carBody,
				btnPane  );
		Scene singlePlayerScene = new Scene(singleplayerroot, 1000, 1000);


		btnSingleplayer.setOnAction(e ->{
			primaryStage.setScene(singlePlayerScene);

		});

		backBtnS.setOnAction(e -> {
			primaryStage.setScene(titleScene);
		});


		Timeline animation = new Timeline(new KeyFrame(Duration.millis(i), e-> {

			if(pt11.getStatus() == Animation.Status.STOPPED) {
				object11.setRadius(5); 
				c++;
			}


			else object11.setRadius(object11.getRadius() + 0.001);



			if(pt12.getStatus() == Animation.Status.STOPPED) {
				object12.setRadius(5); 
				c++;
			}


			else object12.setRadius(object12.getRadius() + 0.001);


			if(pt13.getStatus() == Animation.Status.STOPPED) {
				object13.setRadius(5); 
				c++;
			}


			else object13.setRadius(object13.getRadius() + 0.001);




			if(pt14.getStatus() == Animation.Status.STOPPED) {
				object14.setRadius(5); 
				c++;
			}


			else object14.setRadius(object14.getRadius() + 0.001);


			if(pt15.getStatus() == Animation.Status.STOPPED) {
				object15.setRadius(5); 
				c++;
			}


			else object15.setRadius(object15.getRadius() + 0.001);		

			if(carBody.getBoundsInParent().intersects(object11.getBoundsInParent()) ||
					carBody.getBoundsInParent().intersects(object12.getBoundsInParent())  ||
					carBody.getBoundsInParent().intersects(object13.getBoundsInParent())  ||
					carBody.getBoundsInParent().intersects(object14.getBoundsInParent()) ||
					carBody.getBoundsInParent().intersects(object15.getBoundsInParent()) 
					){

				singleplayerroot.setCenter(lostPane);
				lost.setStroke(Color.BLACK);
				lost.setFill(Color.RED);
				gameOver = false;

				pt11.pause();
				pt12.pause();
				pt13.pause();
				pt14.pause();
				pt15.pause();

				dpt1.pause();
				dpt2.pause();
				dpt3.pause();
				dpt4.pause();
				dpt5.pause();


			}

			else{
				lost.setStroke(Color.TRANSPARENT);
				lost.setFill(Color.TRANSPARENT);
			}



		}));



		singleplayerroot.setOnMouseClicked (e -> {

			if(animation.getStatus() == Animation.Status.PAUSED ){
				animation.play();	
				pause.setFill(Color.TRANSPARENT);
				pause.setStroke(Color.TRANSPARENT);

				pt11.play();
				pt12.play();
				pt13.play();
				pt14.play();
				pt15.play();

				dpt1.play();
				dpt2.play();
				dpt3.play();
				dpt4.play();
				dpt5.play();


			}
			else{
				animation.pause();

				singleplayerroot.setCenter(pausePane);
				pause.setFill(Color.WHITE);
				pause.setStroke(Color.BLACK);

				pt11.pause();
				pt12.pause();
				pt13.pause();
				pt14.pause();
				pt15.pause();

				dpt1.pause();
				dpt2.pause();
				dpt3.pause();
				dpt4.pause();
				dpt5.pause();


			}

		});

		singleplayerroot.setOnKeyPressed(e ->
		{

			switch(e.getCode()){
			case UP:  i -= 0.1; timeLineI -= 100; break;

			case DOWN: i += 0.1; timeLineI += 100;  break;

			case LEFT: carBody.setX(carBody.getX() - 5);break;

			case RIGHT:  carBody.setX(carBody.getX() + 5);break;

			}});

		if(gameOver == false){
			animation.pause();

			pt11.pause();
			pt12.pause();
			pt13.pause();
			pt14.pause();
			pt15.pause();

			dpt1.pause();
			dpt2.pause();
			dpt3.pause();
			dpt4.pause();
			dpt5.pause();
		}

		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		carBody.requestFocus();


		//this is where the multiplayer part starts 

		Button backBtnM = new Button("Back");

		Text comingSoon = new Text("Coming Soon...");
		comingSoon.setFont(Font.font("Comic Sans MS", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
		//		Image image = new Image("/images/lambo.jpg");
		//		ImageView racetrack = new ImageView();
		//		racetrack.setFitHeight(1000);
		//		racetrack.setFitWidth(1000);

		StackPane pane = new StackPane();
		pane.getChildren().addAll( comingSoon);


		BorderPane multiplayerroot = new BorderPane();
		multiplayerroot.setTop(backBtnM);
		multiplayerroot.setCenter(pane);

		//	multiplayerroot.getChildren().add(pane);

		Scene multiPlayerScene = new Scene(multiplayerroot, 1000, 1000);



		btnMultiplayer.setOnAction(e ->{
			primaryStage.setScene(multiPlayerScene);

		});



		backBtnM.setOnAction(e -> {
			primaryStage.setScene(titleScene);
		});


		primaryStage.show();

	}

	//animation for car



	public static void main(String[] args) {
		launch(args);
	}
}
