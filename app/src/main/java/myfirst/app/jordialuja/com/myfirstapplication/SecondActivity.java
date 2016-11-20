package myfirst.app.jordialuja.com.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView texte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        texte = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras!=null){
            texte.setText(extras.getString("NOMBRE"));

        }

    }



}
