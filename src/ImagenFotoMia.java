import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ImagenFotoMia extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Cargar la imagen
        Image image = new Image("FotoMia.jpg");

        // Crear un ImageView para mostrar la imagen
        ImageView imageView = new ImageView(image);

        // Crear el texto y ajustar el estilo
        Text text = new Text("Christian Fernando Rojas Villa");
        text.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        text.setFill(Color.RED);

        // Crear un StackPane para superponer la imagen y el texto
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(imageView, text);

        // Crear la escena y mostrarla en el escenario
        Scene scene = new Scene(stackPane, image.getWidth(), image.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Imagen de mi persona");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}