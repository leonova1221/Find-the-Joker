package com.example.findthejoker;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

        public void onMyClick (View view){
            Intent games = new Intent( MainActivity.this, Play.class );
            MainActivity.this.startActivities( new Intent[]{games} );
        }


}
