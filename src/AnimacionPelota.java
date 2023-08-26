import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AnimacionPelota extends Application {

    private int tamañoPelota = 20;
    private int x, y;
    private int velocidad = 100;
    private int dy = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 600);

        x = tamañoPelota;
        y = (int) (scene.getHeight() / 2);

        Circle pelota = new Circle(x, y, tamañoPelota, Color.RED);

        root.getChildren().add(pelota);

        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                mover();
                pelota.setCenterX(x);
                pelota.setCenterY(y);
            }
        };
        animationTimer.start();

        primaryStage.setTitle("Animación de Pelota JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void mover() {
        x += velocidad;
        y += dy;

        if (x >= (800 - tamañoPelota) || x <= tamañoPelota) {
            velocidad *= -1;
        }
    }
}