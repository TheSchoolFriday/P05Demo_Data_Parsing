package sg.edu.rp.c346.id20046797.demo_data_parsing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswer1 = findViewById(R.id.textViewAnswer1);

        Intent intent = getIntent();
        tvAnswer1.setText(intent.getCharExtra("value", '0') + " is the CHARACTER value.");
    }
}