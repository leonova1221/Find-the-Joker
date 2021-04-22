package com.example.findthejoker;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Play extends AppCompatActivity {


    ImageView left,middle,right;

    Button new_gam;

    List<Integer> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_play );


        left=(ImageView) findViewById(R.id.left);
        middle=(ImageView) findViewById(R.id.middle);
        right=(ImageView) findViewById(R.id.right);

        new_gam=(Button) findViewById(R.id.new_gam);

        cards = new ArrayList<>(  );
        cards.add(107);  //joker
        cards.add(207);  //six
        cards.add(407);  //eight

        Collections.shuffle(cards);

        new_gam.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(cards);

                left.setImageResource( R.drawable.shirt );
                middle.setImageResource( R.drawable.shirt );
                right.setImageResource( R.drawable.shirt );

                Animation anim_left = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.left );
                Animation anim_middle = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.middle );
                Animation anim_right = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.right );

                left.startAnimation( anim_left );
                middle.startAnimation( anim_middle );
                right.startAnimation( anim_right );
            }
        } );

        left.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(0) == 107) {
                    left.setImageResource( R.drawable.joker );
                    Toast.makeText( Play.this, "Победа", Toast.LENGTH_SHORT ).show();
                } else if(cards.get(0) == 207) {
                    left.setImageResource( R.drawable.six );
                } else if(cards.get(0) == 407) {
                    left.setImageResource( R.drawable.eight );
                }

                if(cards.get(1) == 107) {
                    middle.setImageResource( R.drawable.joker );
                } else if(cards.get(1) == 207) {
                    middle.setImageResource( R.drawable.six );
                } else if(cards.get(1) == 407) {
                    middle.setImageResource( R.drawable.eight );
                }
                if(cards.get(2) == 107) {
                    right.setImageResource( R.drawable.joker );
                } else if(cards.get(2) == 207) {
                    right.setImageResource( R.drawable.six );
                } else if(cards.get(2) == 407) {
                    right.setImageResource( R.drawable.eight );
                }
            }
        } );

        middle.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cards.get(1) == 107) {
                    middle.setImageResource( R.drawable.joker );
                    Toast.makeText( Play.this, "Победа", Toast.LENGTH_SHORT ).show();
                } else if(cards.get(1) == 207) {
                    middle.setImageResource( R.drawable.six );
                } else if(cards.get(1) == 407) {
                    middle.setImageResource( R.drawable.eight );
                }

                if(cards.get(0) == 107) {
                    left.setImageResource( R.drawable.joker );
                } else if(cards.get(0) == 207) {
                    left.setImageResource( R.drawable.six );
                } else if(cards.get(0) == 407) {
                    left.setImageResource( R.drawable.eight );
                }
                if(cards.get(2) == 107) {
                    right.setImageResource( R.drawable.joker );
                } else if(cards.get(2) == 207) {
                    right.setImageResource( R.drawable.six );
                } else if(cards.get(2) == 407) {
                    right.setImageResource( R.drawable.eight );
                }
            }
        } );

        right.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(2) == 107) {
                    right.setImageResource( R.drawable.joker );
                    Toast.makeText( Play.this, "Победа", Toast.LENGTH_SHORT ).show();
                } else if(cards.get(2) == 207) {
                    right.setImageResource( R.drawable.six );
                } else if(cards.get(2) == 407) {
                    right.setImageResource( R.drawable.eight );
                }
                if(cards.get(1) == 107) {
                    middle.setImageResource( R.drawable.joker );
                } else if(cards.get(1) == 207) {
                    middle.setImageResource( R.drawable.six );
                } else if(cards.get(1) == 407) {
                    middle.setImageResource( R.drawable.eight );
                }

                if(cards.get(0) == 107) {
                    left.setImageResource( R.drawable.joker );
                } else if(cards.get(0) == 207) {
                    left.setImageResource( R.drawable.six );
                } else if(cards.get(0) == 407) {
                    left.setImageResource( R.drawable.eight );
                }
            }
        } );
    }
}


