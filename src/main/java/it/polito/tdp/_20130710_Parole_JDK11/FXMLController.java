package it.polito.tdp._20130710_Parole_JDK11;


import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

//controller del turno 1 --> modificare per turno 2

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane theRoot;

    @FXML
    private TextArea txtResult;

    @FXML
    private Color x1;

    @FXML
    private TextField txtParolaIniziale;

    @FXML
    private TextField txtParolaFinale;

    @FXML
    private Button btnCerca;

    @FXML
    private TextField txtLunghezza;

    @FXML
    private Button btnCarica;

    @FXML
    void initialize() {
        assert theRoot != null : "fx:id=\"theRoot\" was not injected: check your FXML file 'paroleT1.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'paroleT1.fxml'.";
        assert x1 != null : "fx:id=\"x1\" was not injected: check your FXML file 'paroleT1.fxml'.";
        assert txtParolaIniziale != null : "fx:id=\"txtParolaIniziale\" was not injected: check your FXML file 'paroleT1.fxml'.";
        assert txtParolaFinale != null : "fx:id=\"txtParolaFinale\" was not injected: check your FXML file 'paroleT1.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'paroleT1.fxml'.";
        assert txtLunghezza != null : "fx:id=\"txtLunghezza\" was not injected: check your FXML file 'paroleT1.fxml'.";
        assert btnCarica != null : "fx:id=\"btnCarica\" was not injected: check your FXML file 'paroleT1.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
