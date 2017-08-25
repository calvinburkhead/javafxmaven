package com.nwmsrocks.javafxmaven;

import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class UploaderController {

	@FXML
	private ToggleButton buttonToggle;
	
	@FXML
	private Label labelToggle;
	private String labelToggleAltText;
	
	@FXML
	private Slider sliderToy;
	
	@FXML
	private ProgressIndicator progressToy;
	
	// Public no-args constructor requested for FXML to instantiate
	public UploaderController()
	{

	}
	
	@FXML
	private void initialize()
	{
		// Prep alt text
		labelToggleAltText = "This button is depressed :(";
		
		// Prep slider listener
		sliderToy.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                    Number old_val, Number new_val) {
                        progressToy.setProgress(new_val.doubleValue()/100);
                }
            });
	}
	
	@FXML
	private void buttonToggleAction()
	{
		String newText = labelToggleAltText;
		labelToggleAltText = labelToggle.getText();
		labelToggle.setText(newText);
	}
	
	
}
