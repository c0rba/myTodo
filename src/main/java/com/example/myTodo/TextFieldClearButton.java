package com.example.myTodo;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("text-field-clear-button")
public class TextFieldClearButton extends Div {

    TextField textField = new TextField();
    public TextFieldClearButton() {

        textField.setClearButtonVisible(true);
        add(textField);
    }

    public String getValue(){
        return textField.getValue();
    }

    public void setValue(String newValue) {
        textField.setValue(newValue);
    }

    public void clear(){
        textField.clear();
    }

    public void focus() {
        textField.focus();
    }

    public void setPlaceholder(String placeholderText) {
        textField.setPlaceholder(placeholderText);
    }



}