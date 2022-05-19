package sg.edu.rp.c346.id21037552.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    //Step 1
    TextView tvAnswer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        //Step 2
        tvAnswer3 = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        double value = intentReceived.getIntExtra("Value", (int) 99.99);
        tvAnswer3.setText("Character value received is: " + value);
    }
}