import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    double punktid = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button1;
        Button button2;
        Button button3;
        Button button4;
        Button button5;
        Button button6;


        BorderPane bPane = new BorderPane();
        Scene scene = new Scene(bPane, 800, 650);



        VBox left = new VBox();

        left.setPrefSize(100, 100);
        left.setTranslateY(35);
        left.setTranslateX(35);

        button1 = new Button();
        button1.setPrefSize(100, 100);
        button1.setText("Level1");

        button2 = new Button();
        button2.setPrefSize(100, 100);
        button2.setText("punktid");

        button3 = new Button();
        button3.setPrefSize(100, 100);
        button3.setText("Level2");

        button4 = new Button();
        button4.setPrefSize(100, 100);
        button4.setText("Level3");

        button5 = new Button();
        button5.setPrefSize(100, 100);
        button5.setText("Level4");


        button6 = new Button();
        button6.setPrefSize(100, 100);
        button6.setText("Level5");


        button1.setOnAction(event -> {
                    double count = 0;
                    punktid++;
                    button2.setText("" + punktid);

            if (punktid >= 2 && punktid < 15) button3.setOnAction(event1 -> {
                        punktid = punktid +2;
                        button2.setText("" + punktid);
                        System.out.println(punktid);
            });
            else if (punktid >= 15) button4.setOnAction(event2 -> {
                        punktid = punktid +5;
                        button2.setText("" + punktid);
                        System.out.println(punktid);
            });
            else if (punktid >= 50) button4.setOnAction(event3 -> {
                        punktid = punktid +10;
                        button2.setText("" + punktid);
                        System.out.println(punktid);
            });



            }

        );



        left.getChildren().addAll(button1,button3, button4, button5,button6);

        VBox setCenter = new VBox();

        setCenter.setPrefSize(60, 60);
        setCenter.setTranslateY(100);
        setCenter.setTranslateX(100);

        setCenter.getChildren().addAll(button2);

        bPane.setLeft(left);
        bPane.setCenter(setCenter);

        primaryStage.setTitle("Kliki mind");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}



