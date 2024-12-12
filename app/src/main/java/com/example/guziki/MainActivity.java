package com.example.guziki;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private float textSize = 24f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        // Przycisk 1: Zmiana koloru tekstu
        button1.setOnClickListener(v -> textView.setTextColor(Color.RED));

        // Przycisk 2: Zmiana tekstu
        button2.setOnClickListener(v -> textView.setText("Text changed!"));

        // Przycisk 3: Ukrywanie TextView
        button3.setOnClickListener(v -> {
            if (textView.getVisibility() == View.VISIBLE) {
                textView.setVisibility(View.INVISIBLE);
            } else {
                textView.setVisibility(View.VISIBLE);
            }
        });

        // Przycisk 4: Otwieranie nowej aktywności
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NewActivity.class);
            startActivity(intent);
        });

        // Przycisk 5: Zwiększanie rozmiaru tekstu
        button5.setOnClickListener(v -> {
            textSize += 2f;
            textView.setTextSize(textSize);
        });
    }
}
