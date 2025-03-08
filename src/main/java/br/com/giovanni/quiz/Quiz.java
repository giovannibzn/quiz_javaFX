package br.com.giovanni.quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Quiz extends Application {

    private int currentQuestion = 0;
    private int score = 0;

    //Perguntas e Respostas
    private String[] questions = {
            "Qual a capital da França?",
            "Quem revelou Neymar Jr?",
            "Qual maior planeta dos sistema solar?"
    };

    private String[][] options = {
            {"Paris", "Roma", "Londres", "Berlim"},
            {"Santos", "Barcelona", "Paris Saint German", "Real Madrid"},
            {"Terra", "Marte", "Júpiter", "Saturno"}
    };

    // Indices Respostas certas
    private int[] correctAnswares = {0, 0, 2};

    private Label questionsLabel;
    private ToggleGroup toggleGroup;
    private VBox root;


    @Override
    public void start(Stage stage) throws IOException {

        root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        //Mostrat perguntas
        questionsLabel = new Label(questions[currentQuestion]);
        questionsLabel.getStyleClass().add("label");
        root.getChildren().add(questionsLabel);

        // Adicionar opções de respostas
        toggleGroup = new ToggleGroup();

        for(String opttion:options[currentQuestion]){
            RadioButton radioButton = new RadioButton(opttion);
            radioButton.setToggleGroup(toggleGroup);
            radioButton.getStyleClass().add("radio-button");
            root.getChildren().add(radioButton);
        }

        //Botão para próx. pergunta
        Button nextButton = new Button("Próxima");
        //evento
        nextButton.setOnAction(e -> handleNextQuestion());
        nextButton.getStyleClass().add("button");
        root.getChildren().add(nextButton);

        Scene scene = new Scene(root, 520, 420);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Quiz");
        stage.setScene(scene);
        stage.show();
    }

    private void handleNextQuestion(){

        RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();

        if(selectedRadioButton != null){

            int selectedIndex = getSelectedIndex();

            if(selectedIndex == correctAnswares[currentQuestion]){
                score++;
            }

            //mudar pergunta
            currentQuestion++;

            if(currentQuestion < questions.length){
                // atualizar para novas perguntas
                updateQuestion();
            } else {
                //mostrar resultado
                showScore();
            }
        }
    }

    private void updateQuestion(){

        //atualizar questao
        questionsLabel.setText(questions[currentQuestion]);

        //remover anteriores
        root.getChildren().removeIf(node -> node instanceof RadioButton);

        //adicionar as novas opções
        toggleGroup = new ToggleGroup();

        //inverter array
        String[] reversedOptions = new String[options[currentQuestion].length];

        for(int i = 0; i < options[currentQuestion].length; i++){
            reversedOptions[i] = options[currentQuestion][options[currentQuestion].length - 1 - i];
        }

        for(String opttion:reversedOptions){
            RadioButton radioButton = new RadioButton(opttion);
            radioButton.setToggleGroup(toggleGroup);
            radioButton.getStyleClass().add("radio-button");
            //label = 0; opcoes = 1; botão = 2;
            root.getChildren().add(1, radioButton);
        }
    }

    private void showScore(){
        root.getChildren().clear();
        Label scoreLabel = new Label("Sua pontuação foi de " + score + " de um totla de " + questions.length);
        root.getChildren().add(scoreLabel);
    }

    private int getSelectedIndex(){
        RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
        return root.getChildren().indexOf(selectedRadioButton) - 1;
    }

    public static void main(String[] args) {
        launch();
    }
}