package com.example.greeterapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void didTapGreetButton(View view) {
        EditText greetEditText =
                (EditText) findViewById(R.id.greetEditText);

        String name = greetEditText.getText().toString();
        String greeting = String.format("Hello, %s!", name);

        TextView messageTextView =
                (TextView) findViewById(R.id.messageTextView);

        messageTextView.setText(greeting);
    }
}