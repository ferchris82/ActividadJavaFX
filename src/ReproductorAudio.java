import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class ReproductorAudio extends Application {

    private AudioClip sonido1;
    private AudioClip sonido2;

    @Override
    public void start(Stage primaryStage) {
        sonido1 = new AudioClip(getClass().getResource("MarkAntony.wav").toString());
        sonido2 = new AudioClip(getClass().getResource("MarkAntony2.wav").toString());

        Button playOnceSound1Button = new Button("Reproducir una vez sonido 1");
        playOnceSound1Button.setOnAction(event -> sonido1.play());

        Button playOnceSound2Button = new Button("Reproducir una vez sonido 2");
        playOnceSound2Button.setOnAction(event -> sonido2.play());

        Button playIndefinitelySound1Button = new Button("Reproducir indefinidamente sonido 1");
        playIndefinitelySound1Button.setOnAction(event -> sonido1.play(100));

        Button playIndefinitelySound2Button = new Button("Reproducir indefinidamente sonido 2");
        playIndefinitelySound2Button.setOnAction(event -> sonido2.play(100));

        Button stopSoundsButton = new Button("Detener sonidos");
        stopSoundsButton.setOnAction(event -> {
            sonido1.stop();
            sonido2.stop();
        });

        VBox root = new VBox(10,
                playOnceSound1Button,
                playOnceSound2Button,
                playIndefinitelySound1Button,
                playIndefinitelySound2Button,
                stopSoundsButton
        );

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Sound App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}