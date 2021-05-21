package sg.edu.rp.c346.id20046797.demo_data_parsing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnInt, btnChar;
    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInt = findViewById(R.id.buttonPassInteger);
        btnChar = findViewById(R.id.buttonPassChar);
        tvDouble = findViewById(R.id.textViewPassDouble);

        btnInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intIntent = new Intent(MainActivity.this, SecondActivity.class);
                intIntent.putExtra("value", 1);
                startActivity(intIntent);
            }
        });

        btnChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent charIntent = new Intent(MainActivity.this, ThirdActivity.class);
                charIntent.putExtra("value", 'A');
                startActivity(charIntent);
            }
        });

        tvDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doubleIntent = new Intent(MainActivity.this, ForthActivity.class);
                doubleIntent.putExtra("value", 99.99);
                startActivity(doubleIntent);
            }
        });
    }
}