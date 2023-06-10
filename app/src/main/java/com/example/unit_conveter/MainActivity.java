
package com.example.unit_conveter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextCentimeters;
    private TextView textViewResult;

    private EditText editTextKilograms;

    private TextView textViewResult1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCentimeters = findViewById(R.id.editTextCentimeters);
        Button buttonConvert = findViewById(R.id.buttonConvert);
        textViewResult = findViewById(R.id.textViewResult);
        editTextKilograms = findViewById(R.id.editTextKilograms);

        Button buttonConvert1 = findViewById(R.id.buttonConvert1);
        textViewResult1 = findViewById(R.id.textViewResult1);



        buttonConvert.setOnClickListener(v -> {
            convertCentimetersToMeters();
            convertKilogramsToGrams();
        });
    }

    private void convertCentimetersToMeters() {
        String centimetersStr = editTextCentimeters.getText().toString().trim();

        if (centimetersStr.isEmpty()) {
            textViewResult.setText("Please enter a value in centimeters.");
            return;
        }

        double centimeters = Double.parseDouble(centimetersStr);
        double meters = centimeters / 100;

        textViewResult.setText(String.format("%.2f centimeters = %.2f meters", centimeters, meters));
    }

    private void convertKilogramsToGrams() {
        String Kilograms = editTextKilograms.getText().toString().trim();

        if (Kilograms.isEmpty()) {
            textViewResult1.setText("Please enter a value in Kilograms.");
            return;
        }

        double Kilograms1 = Double.parseDouble(Kilograms);
        double grams = Kilograms1 * 1000;

        textViewResult1.setText(String.format("%.2f Kilograms = %.2f grams", Kilograms1, grams));
    }
}



