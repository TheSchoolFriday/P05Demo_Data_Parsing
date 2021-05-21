package sg.edu.rp.c346.id20046797.demo_data_parsing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textViewAnswer);

        Intent intent = getIntent();
        tvAnswer.setText(intent.getIntExtra("value", 0) + " is the INTEGER value.");
    }
}