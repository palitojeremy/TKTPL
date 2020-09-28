package id.ac.ui.cs.mobileprogramming.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonMorning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMorning = (Button) findViewById(R.id.button);
        buttonMorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoodMorning();
            }
        });
    }

    public void openGoodMorning() {
        setContentView(R.layout.good_morning);
    }
}