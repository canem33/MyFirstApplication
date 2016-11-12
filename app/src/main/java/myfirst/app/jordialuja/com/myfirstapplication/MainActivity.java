package myfirst.app.jordialuja.com.myfirstapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edittexte;
    Button boto1,boto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boto1 = (Button) findViewById(R.id.button1);
        boto2 = (Button) findViewById(R.id.button2);
        boto1.setOnClickListener(this);
        boto2.setOnClickListener(this);
        edittexte = (EditText) findViewById(R.id.edittext1);
    }


    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.button1){


            Toast.makeText(getApplicationContext()," Està molt bona!!!", Toast.LENGTH_LONG).show();

        }
        else if (view.getId()== R.id.button2){


            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("NOM",edittexte.getText().toString());

            startActivity(intent);

        }

    }
}
