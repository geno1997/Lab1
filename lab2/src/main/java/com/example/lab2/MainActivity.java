package com.example.lab2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button pressMeButton;
    private CheckBox checkBox;
    private Switch switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai_linear);

        // Initialize views
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText); // Assuming you have an EditText in your layout
        pressMeButton = findViewById(R.id.buttonPressMe);
        checkBox = findViewById(R.id.checkBox);
        switchButton = findViewById(R.id.switchOn);

        // Set OnClickListener for the "Press Me" button
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the current text from the EditText
                String newText = editText.getText().toString();

                // Set the text to the TextView
                textView.setText(newText);
               showToast(getString(R.string.Toast));
               ;
            }
        });
    }


private void showToast(String message) {
        Context context = getApplicationContext();
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
        }
