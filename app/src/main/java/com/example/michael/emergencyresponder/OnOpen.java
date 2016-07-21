package com.example.michael.emergencyresponder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Michael on 4/28/16.
 */
public class OnOpen extends AppCompatActivity{

    ListView lv;
    ArrayList<String> al;

    Button _accept, _decline;
    ImageView img;

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_page);

        _accept = (Button) findViewById(R.id.accept);
        _decline = (Button) findViewById(R.id.decline);
        img = (ImageView) findViewById(R.id.imageView);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k  = new Intent(getBaseContext(),MainActivity.class);
                startActivity(k);
            }
        });

        _accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToUrl ( "https://www.google.com/maps/dir/Charles+B.+Gentry+Bldg,+249+Glenbrook+Rd,+Storrs,+CT+06269/Homer+Babbidge+Library,+Mansfield,+CT/@41.8078407,-72.2541377,18z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x89e68a3be6aa9917:0xfa1c602d9c8bb3b6!2m2!1d-72.2538405!2d41.8085735!1m5!1m1!1s0x89e68a3c64fb01e9:0x75d1ed7d1324575e!2m2!1d-72.251704!2d41.806629!3e2");
                goToUrl("https://www.google.com/maps/dir/41.8062696,-72.2538058/41.8068834,-72.2542017/@41.8066072,-72.2545312,18.36z/data=!4m2!4m1!3e2");

            }
        });

        _decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });

    }

}
