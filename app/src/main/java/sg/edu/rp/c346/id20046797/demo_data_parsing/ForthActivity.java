 package sg.edu.rp.c346.id20046797.demo_data_parsing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

 public class ForthActivity extends AppCompatActivity {
    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        tvAnswer2 = findViewById(R.id.textViewAnswer2);
        Intent intent = getIntent();
        Double placedValue = intent.getDoubleExtra("value", 1.11);
        tvAnswer2.setText(placedValue + " is the DOUBLE value.");
    }
}