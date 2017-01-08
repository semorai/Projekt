import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    int punktid = 0;



    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button0;
        Button button1;
        Button button2;

        GridPane gPane = new GridPane();
        Scene scene = new Scene(gPane, 800, 800);

        VBox left = new VBox();

        left.setPrefSize(100, 100);
        left.setTranslateY(35);
        left.setTranslateX(35);

        button0 = new Button();
        button0.setPrefSize(100, 100);
        button0.setText("punktid");

        button1 = new Button();
        button1.setPrefSize(100, 100);
        button1.setText("Levelup");

        button2 = new Button();
        button2.setPrefSize(100, 100);


        VBox sisu = new VBox();

        sisu.setPrefSize(100, 100);
        sisu.setTranslateY(100);
        sisu.setTranslateX(100);

        sisu.getChildren().addAll(button2);

        button1.setOnAction(event -> {
                    int count = 0;
                    punktid++;
                    button0.setText("" + punktid);

                if (punktid >= 2 && punktid < 21) {
                    punktid = punktid + 1 * RandomGenerator.liidetav(20);
                    button0.setText("" + punktid);

            }
            else if (punktid >= 21 ) {

                button0.setText("Stop the game!");
                button0.setOnAction(event1 -> {
                    System.exit(0);
                        }
                );
            }
            else if (punktid >20 && punktid < 22)  {

                button2.setText("Olekdki voitja!");
                button2.setOnAction(event1 -> {
                                System.exit(0);
                            }
                    );

                }

            else {
                System.out.println("Something else");

            }
            }
        );

        left.getChildren().addAll(button1);

        VBox setCenter = new VBox();

        setCenter.setPrefSize(100, 100);
        setCenter.setTranslateY(100);
        setCenter.setTranslateX(100);

        setCenter.getChildren().addAll(button0);


        gPane.add(left, 1,1);
        gPane.add(setCenter, 2, 1);
        gPane.add(sisu, 3, 1);

        primaryStage.setTitle("Kliki mind");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}



