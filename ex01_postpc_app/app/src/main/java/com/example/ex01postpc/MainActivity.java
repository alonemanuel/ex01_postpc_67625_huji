package com.example.ex01postpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button createButton = findViewById(R.id.createButton);
        final EditText userInput = findViewById(R.id.userInput);
        final TextView textLabel = findViewById(R.id.usersTextView);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideKeyboard();
                textLabel.setText(userInput.getText());
                userInput.setText("");
            }
        });

    } 

    // keyboard hider
    public void hideKeyboard() {
        try {
            InputMethodManager inputmanager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
            if (inputmanager != null) {
                inputmanager.hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), 0);
            }
        } catch (Exception var2) {
        }

    }
}
