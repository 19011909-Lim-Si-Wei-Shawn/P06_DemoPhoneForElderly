package sg.edu.rp.c346.id19011909.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Creating Variable,
    Button btnSon;
    Button btnDaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking Variable,
        btnSon = findViewById(R.id.buttonCallSon);
        btnDaughter = findViewById(R.id.buttonCallDaughter);

        //Setting Action,
        btnSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+92240336));
                startActivity(intentCall);
            }
        });

        btnDaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+89675543));
                //startActivity(intentCall);

                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("http://www.amazon.com"));
                startActivity(intent);

            }
        });

    }
}