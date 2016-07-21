package com.example.michael.emergencyresponder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView gs;
    Button save;
    EditText one, two, three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regular);

        gs = (ImageView) findViewById(R.id.imageView2);
        save = (Button) findViewById(R.id.button);
        one = (EditText) findViewById(R.id.one);
        two = (EditText) findViewById(R.id.two);
        three = (EditText) findViewById(R.id.three);

        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k  = new Intent(getBaseContext(),OnOpen.class);
                startActivity(k);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Your Settings Have Been Saved!", Toast.LENGTH_SHORT).show();
                String oneText = one.getText().toString();
                String twoText = two.getText().toString();
                String threeText = three.getText().toString();
                one.setText(oneText);
                two.setText(twoText);
                three.setText(threeText);
            }
        });


    }
}
